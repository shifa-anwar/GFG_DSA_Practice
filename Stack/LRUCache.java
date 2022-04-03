package CollectionPractice;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
        private Deque<Integer> deque;
        private HashSet<Integer> hash;//to check whether key is already present
        private final int CACHE_SIZE;//frame size
        LRUCache(int capacity)
        {
            deque= new LinkedList<>();
            hash = new HashSet<>();
            CACHE_SIZE=capacity;
        }
        public void refer(int page)
        {
            if(!hash.contains(page))
            {
           /*if key is not present in frame and if frame is full
             then remove last element from deque and also from hashset
            */
                if(deque.size()==CACHE_SIZE)
                {
                    int last = deque.removeLast();
                    hash.remove(last);
                }
            }
            else
            {
             //if page is already present then we will remove that page
                deque.remove(page);
            }
            deque.push(page);
            hash.add(page);
        }
        public void display()
        {
            Iterator<Integer> itr = deque.iterator();
            while(itr.hasNext())
            {
                System.out.print(itr.next()+" ");
            }
        }
    public static void main(String[] args) {
           LRUCache cache = new LRUCache(4);
           cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.refer(2);
        cache.refer(2);
        cache.refer(1);
        cache.display();
    }
}
