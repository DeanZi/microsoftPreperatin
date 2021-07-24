package com.company;
import java.util.*;


/**
 * List Node as given in the book
 * @param <T>
 */

class ListNode<T> {
    public T data;
    public ListNode<T> next;
    ListNode(T data, ListNode<T> next){
        this.data =data;
        this.next=next;
    }
}

/**
 * List Node as given in the book with addition of prev pointer for each node
 * @param <T>
 */
//class ListNode<T> {
//    public T data;
//    public ListNode<T> next;
//    public ListNode<T> prev;
//    ListNode(T data, ListNode<T> next, ListNode<T> prev){
//        this.data =data;
//        this.next=next;
//        this.prev=prev;
//    }
//}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /**
         * PARITY
         */
        // System.out.println(parity (20));

        /**
         *  Dutch
         */
        //int [] arr = new int [] {0,-1 ,-1, -2,-6,- 7, 1};
        //dutchFlag(arr, 1);
        //System.out.println(Arrays.toString(arr));
        /**
         * MaxProfit
         */
        //System.out.println(maxProfit(arr));

        /**
         * FromInt , FromString
         */
        //System.out.println(fromString("4133"));

        /**
         * Stack Implementation for max in O(1)
         */

//        Stack testStack = new Stack();
//        testStack.push(9);
//        testStack.push(8);
//        testStack.push(-1);
//        testStack.push(10);
//        testStack.push(10);
//        System.out.println (testStack.max());

        /**
         * Merging sorted Lists
         * with minHeap
         */

//          List<Integer> l1 = new ArrayList<>();
//          l1.add(1);
//          l1.add(8);
//          l1.add(10);
//          List<Integer> l2 = new ArrayList<>();
//          l2.add(3);
//          l2.add(5);
//          l2.add(10);
//          List<Integer> l3 = new ArrayList<>();
//          l3.add(0);
//          l3.add(2);
//          l3.add(4);
//          List<List<Integer>> sortedLists = new ArrayList<>();
//          sortedLists.add(l1);
//          sortedLists.add(l2);
//          sortedLists.add(l3);
//          System.out.println(Arrays.toString(mergeAllLists(sortedLists).toArray()));
        /**
         * First Occurence
         */
//        ArrayList <Integer> intArr = new ArrayList<>();
//        intArr.add(1);
//        intArr.add(1);
//        intArr.add(1);
//        intArr.add(1);
//        intArr.add(1);
//        intArr.add(2);
//        intArr.add(2);
//        intArr.add(3);
//        intArr.add(3);
//        intArr.add(3);
//
//        System.out.println(firstOcurence(intArr, 3));
        /**
         * construct letter from magazine
         */
//        String letter = "hello everyone i love u";
//        String Magazine = "olleh everyone i lve you guys";
//        System.out.println(canBeConstructed(letter, Magazine));
        /**
         *  find intersection
         */
//          ArrayList<Integer> A =new ArrayList<>();
//          A.add(1);
//          A.add(2);
//          A.add(3);
//          A.add(5);
//          A.add(5);
//          ArrayList<Integer> B =new ArrayList<>();
//          B.add(0);
//          B.add(2);
//          B.add(2);
//          B.add(4);
//          B.add(5);
//
//          System.out.println(Arrays.toString(findIntersection(A,B).toArray()));

        /**
         * BFS way to check is tree is BST
         *
         *             10
         *           /   \
         *          7    15
         *         / \   / \
         *        4  9  14 16
         */
//        BinaryTreeNode <Integer> root = new BinaryTreeNode<>(10,
//                new BinaryTreeNode<>(7,
//                        new BinaryTreeNode<>(4, null, null),
//                        new BinaryTreeNode<>(9, null, null)),
//                new BinaryTreeNode<>(15,
//                        new BinaryTreeNode<>(14, null, null),
//                        new BinaryTreeNode<>(16, null, null)));
//        System.out.println(checkBSTWithBFS(root));
//

        /**
         * Hanoi testing
         */
//        java.util.Stack<Integer> s1 = new java.util.Stack<>();
//        java.util.Stack <Integer> s2 = new java.util.Stack<>();
//        s1.push(3);
//        s1.push(2);
//        s1.push(1);
//        hanoiPed source = new hanoiPed(s1, 'a');
//        hanoiPed target = new hanoiPed(s2, 'b');
//        hanoi(source,target);

        /**
         * testing DP score and playScores combinations
         */

//        ArrayList<Integer>arr = new ArrayList<>();
//        arr.add(2);
//        arr.add(3);
//        arr.add(7);
//        System.out.println(numOfCombinationConsructScore(7, arr));
        /**
         * testin three elements in array can add to given sum.
         */
//        int sum = 23;
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(7);
//        list.add(2);
//        list.add(3);
//        list.add(5);
//        System.out.println(isThreeSum(sum, list));

        /**
         * The Maze solution search
         */
//        MazeEntry [] [] maze = new MazeEntry[3][3];
//        maze [0][0] = new MazeEntry(false, 0, 0, false);
//        maze [1][0] = new MazeEntry(true, 1, 0, false);
//        maze [2][0] = new MazeEntry(true, 2, 0, false);
//        maze [0][1] = new MazeEntry(true, 0, 1, false);
//        maze [1][1] = new MazeEntry(true, 1, 1, false);
//        maze [2][1] = new MazeEntry(false, 2, 1, false);
//        maze [0][2] = new MazeEntry(true, 0, 2,false);
//        maze [1][2] = new MazeEntry(true, 1, 2, false);
//        maze [2][2] = new MazeEntry(true, 2, 2, false);
//        System.out.println(mazeSolver(maze, maze[2][0], maze[0][2]));

        /**
         * Random size k subset at the begining of the array
         */

//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.add(5);
//        array.add(6);
//        array.add(7);
//        array.add(8);
//        array.add(9);
//        randomSizeKSubset(3,array);
//        System.out.println(Arrays.toString(array.toArray()));

        /**
         *
         * Matrix spiral representation
         */
//        int [][] arr = {{1,2,3,4},{10,5,6,12},{7,8,9,34},{45,55,66,77}};
//        System.out.println(spiralRepresentation(arr));
//        System.out.println(spiralSophistication(arr));

        /**
         * Base Converter
         */

        //System.out.println(baseConvert("1010",2,10));


        /**
         * test operations on character array and its prefix
         */

//        ArrayList<Character> charArr = new ArrayList<>();
//        charArr.add('a');
//        charArr.add('b');
//        charArr.add('c');
//        charArr.add('a');
//        charArr.add('a');
//        charArr.add('a');
//        charArr.add('a');
//
//        System.out.println(Arrays.toString(operationsOnChars(4,charArr).toArray()));

        /**
         * add 1 to decimal "array"
         */
//        ArrayList<Integer> decimal = new ArrayList<>();
//        decimal.add(1);
//        decimal.add(9);
//        decimal.add(9);
//        System.out.println(Arrays.toString(addOne(decimal).toArray()));

        /**
         * Test reverse sublist
         */
//        ListNode <Integer> head = new ListNode<>(7,new ListNode<>(0,
//                new ListNode<>(1, new ListNode<>(2,new ListNode<>(9,null)))));
//        reverseSubList(1,4,head);
//        while (head != null){
//            System.out.print(head.data + "--> ");
//            head = head.next;
//        }


        /**
         * A Tree to check the level iteration function
         *
         *             10
         *           /   \
         *          7    15
         *         / \   / \
         *        4  9  14 16
         */
//        BinaryTreeNode <Integer> root = new BinaryTreeNode<>(10,
//                new BinaryTreeNode<>(7,
//                        new BinaryTreeNode<>(4, null, null),
//                        new BinaryTreeNode<>(9, null, null)),
//                new BinaryTreeNode<>(15,
//                        new BinaryTreeNode<>(14, null, null),
//                        new BinaryTreeNode<>(16, null, null)));
//        System.out.println(Arrays.toString(getTreeByLevel(root).toArray()));

        /**
         * 2 threads, prints concurrently 1-->100.
         */
//        Monitor m = new Monitor();
//        OddThread t1 = new OddThread(m);
//        EvenThread t2 = new EvenThread(m);
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
        /**
         * Finding the k nearest stars to earth
         */

//        Star s1 = new Star(1,5,8, "s1");
//        Star s2 = new Star (-10, 2, 3 , "s2");
//        Star s3 = new Star (-6, 7, -2, "s3");
//        Star s4 = new Star (0, 10, -5, "s4");
//        Star s5 = new Star (-3, 3, -2, "s5");
//        ArrayList<Star> STARS = new ArrayList<>();
//        STARS.add(s1);
//        STARS.add(s2);
//        STARS.add(s3);
//        STARS.add(s4);
//        STARS.add(s5);
//        System.out.println(findKClosestStars(STARS, 2));

        /**
         * sqrt function
         */
//        int k =  16;
//        System.out.println(sqrt(k));
        /**
         * Find kth largest element in array
         */
//        ArrayList <Integer> A = new ArrayList<>();
//        A.add(9);
//        A.add(12);
//        A.add(2);
//        A.add(20);
//        A.add(8);
//        A.add(3);
//        A.add(5);
//        A.add(6);
//
//        System.out.println(findKthLargest(A, 4));

        System.out.println(multiply(5,7));
    }

    /****
     * FIRST TEAMS INTERVIEW
     * @param sum
     * @param A
     * @return
     */
    public static boolean isSumInArry(int sum, ArrayList <Integer> A){
        //Sort the given
        Collections.sort(A);
        int lower = 0;
        int upper = A.size()-1;

        while(lower<upper) {
            if(sum - (A.get(lower) + A.get(upper)) == 0){
                return true;
            }else if (sum - (A.get(lower) + A.get(upper)) >0){
                lower++;
            }else upper --;

        }
        return false;

    }

    public static List<String> getWords (String word){
        StringBuilder sb = new StringBuilder(word);
        List<String> result = new ArrayList<>();
        helperFunction("",0, word, result);
        return result;

    }

    //THESE TWO ARE GIVEN FIXED FUNCTIONS
    public static boolean isValidWord(String str){
        return str.charAt(0)=='a';
    }
    public static Character [] getSubs (char c){
        Character [] arr = new Character [3];
        return arr;
    }


    public static void  helperFunction (String tmpString , int indexOfChar, String original, List<String> result){
       // boolean ans = true;
        if(tmpString.length() == original.length())
            if(isValidWord(tmpString)){
                result.add(tmpString);
                return ;
            }
        for (int i=0; i < getSubs(original.charAt(indexOfChar)).length; i++){
            helperFunction(tmpString + getSubs(original.charAt(indexOfChar))[i], indexOfChar++, original, result);
        }
        return ;
    }
/****************************************************************************************************************************/


    /**
     * Second teams interview
     */

    public static HashMap <Character, Integer> cache = new LinkedHashMap<>(3);
    public static HashMap <Character, ListNode<Character>> helperTable = new LinkedHashMap<>(3);
    public static ListNode <Character> previousAdded = null;
    public static ListNode <Character> last = null;
    public static ListNode <Character> first = null;

    public static Integer get(Character c){
        if(cache.containsKey(c))
            return cache.get(c);
        else return -1;
    }

//    public static void update (Character c , Integer value ){
//        ListNode curr = helperTable.get(c);
//        curr.prev.next =curr.next;
//        helperTable.get(c).next = last;
//        cache.put(c, value);
//
//
//    }
//    public static void addToCache (Character c, Integer value){
//        if(cache.size() <= 3) {
//            cache.put(c, value);
//            ListNode toAdd;
//            toAdd = new ListNode<>(c, previousAdded, null);
//            if (cache.size() == 1)
//                first = toAdd;
//            if(toAdd!=null && toAdd.next!=null)
//                toAdd.next.prev = toAdd;
//            last = toAdd;
//            helperTable.put(c, toAdd);
//        }else {
//
//            helperTable.put(first.data, new ListNode<>(c, previousAdded, null));
//            update(helperTable.get(first.data).data, cache.get(helperTable.get(first.data).data));
//        }
//
//    }

    /***************************************************************************************************************/




    /***
     * DEAN RATE 1
     * check parity of a given int - 32 bit word in Java.
     * for long parity check (64 bit) there is another shift to be added :
     *      x^=x>>>32
     *      plus needed to change int to long.
     */
    public static boolean parity (int x){
        x = x ^ x >>> 16;
        x ^= x>>>8;
        x ^= x>>>4;
        x ^= x >>> 2;
        x ^= x >>> 1;

        if ((x & 1) == 0) return true ;
        return false;
    }

    /***
     * DEAN RATE 1
     * an O(1) space and O(n) - the size of the array time complexity
     * @param arr an array of ints
     * @param i - index within the array limits
     * sorting the array in a way that arr[i] is the pivot,
     * all element smaller will come first, then equal to the pivot then larger.
     */


    public static void dutchFlag (int [] arr , int i){
        if ( i >= arr.length)
            return;
        int pivot = arr [i];
        int smaller = 0, equal = 0;
        int greater = arr.length-1;
        int tmp = -1;
        while (greater > equal){

            if(arr[equal]== pivot){
                equal++;
            }
            else if (arr[equal] > pivot){
                tmp = arr[equal];
                arr[equal]= arr[greater];
                arr[greater]=tmp;
                greater--;
            } else {
                tmp = arr[equal];
                arr[equal]= arr[smaller];
                arr[smaller]=tmp;
                equal++;
                smaller ++;
            }

        }
        System.out.println(Arrays.toString(arr));
        return;

    }
    /*
    DEAN RATE 1
    given an array of prices (int) - representing a stock price in each day,
    return the maximum profit you can make on a single Buy and Sell.
    Additional Space - constant, time complexity O(n) - one iteration on the array.
     */
    public static int maxProfit (int [] arr){
        int minVal = Integer.MAX_VALUE;
        int ans = 0;
        for (int i=0; i< arr.length; i++){
            minVal = Math.min(minVal, arr[i]);
            ans = Math.max(ans, arr[i] - minVal);
        }
        return ans;
    }

    /**
     * DEAN RATE 1
     * Function to turn String into int, O(1) additional space, O(n) runtime.
     * @param number
     * @return
     */
    public static int fromString (String number){
        int length = number.length();
        int ans = 0;
        //plus by default
        int sign = 1;
        if(number.charAt(0)=='-')
            sign = -1;
        for (int i = sign == 1 ? 0 : 1; i< length; i++){
            ans += number.charAt(i) - '0';
            if(i < length - 1)
                ans*=10;

        }
        return ans * sign;
    }

    /**
     * DEAN RATE 1
     * O(1) additional space
     * HashMap size 10.
     * Time complexity is O(number of digits) since reverse is O(n) - this case number
     * of digits and we perform numOfDigits divisions.
     *
     * @param number
     * @return
     */
    public static String fromInt (int number){
        HashMap<Integer,Character> hs = new HashMap<>();
        hs.put(9, '9');
        hs.put(8, '8');
        hs.put(7, '7');
        hs.put(6, '6');
        hs.put(5, '5');
        hs.put(4, '4');
        hs.put(3, '3');
        hs.put(2, '2');
        hs.put(1, '1');
        hs.put(0,'0');
        int sign = 1;
        if(number<0) {
            number *= -1;
            sign = -1;
        }
        StringBuilder sb = new StringBuilder();

        while (number > 0){
            sb.append(hs.get(number%10));
            number/=10;
        }
        if(sign == -1)
            sb.append('-');
        sb.reverse();
        return sb.toString();
    }

    /**
     *
     * DEAN RATE 1
     * Design of a stack in which you can find its maximum value
     * in O(1) , additional memory best case constant, O(n) worst case.
     */
// helper class to hold a pair of value and its count
    public static class MaxWithCount{
        Integer element;
        Integer count;
        MaxWithCount(Integer e, Integer c){
            element = e;
            count = c;
        }
    }
    public static class Stack{
        Deque <Integer> theStack = new ArrayDeque<>();
        Deque <MaxWithCount> maxWithCount = new ArrayDeque<>();

        private boolean empty(){
            return theStack.peekFirst() == null;
        }

        private Integer max (){
            if(!empty())
                return maxWithCount.peekFirst().element;
            else return -1;
        }

        private Integer pop (){
            if(! empty()){
                if(theStack.peekFirst().equals(maxWithCount.getFirst().element)) {
                    if (maxWithCount.getFirst().count.equals(1))
                        maxWithCount.removeFirst();
                    else maxWithCount.getFirst().count = maxWithCount.getFirst().count - 1;
                }
                return theStack.removeFirst();

            } else return -1;
        }

        private void push (Integer element){
            theStack.addFirst(element);
            if(!maxWithCount.isEmpty()) {
                if (maxWithCount.getFirst().element.equals(element))
                    maxWithCount.getFirst().count = maxWithCount.getFirst().count + 1;
                else if (maxWithCount.getFirst().element.compareTo(element) < 0) {
                    MaxWithCount toAdd = new MaxWithCount(element, 1);
                    maxWithCount.addFirst(toAdd);
                }
            }else {
                MaxWithCount toAdd = new MaxWithCount(element, 1);
                maxWithCount.addFirst(toAdd);
            }

        }

    }

    /**
     *
     * BinaryTreeNode class
     * @param <T>
     */
    public static class BinaryTreeNode<T> {
        public T data;
        public BinaryTreeNode<T> left, right, parent;
        public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right, BinaryTreeNode<T> parent){
            this.data = data;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }

    /**
     * DEAN RATE 2
     * Balance checker that hold the height of the subtree (right or left)
     * then we can easily know the height of the current node and check if its
     * balanced by the heights of its subtrees.
     */
    public static class BalanceChecker{
        Boolean isBalanced;
        Integer height;
        public BalanceChecker (Boolean ib, Integer height){
            isBalanced = ib;
            this.height = height;
        }
    }

    /**
     * starter function
     * @param root
     * @return
     */
    public static boolean checkIfBalanced (BinaryTreeNode<Integer> root){
        return isBalanced(root).isBalanced;
    }

    /**
     * Does post order O(n) runtime, but works in O(treeHeight) additional space
     * due to keeping checkers along with the call stack and not a constant ds e.g
     * hashmap for all n nodes heights.
     * plus this function is a smart recursion in which it can terminate calculation
     * for example if found unbalanced left subtree - it will not calculate the
     * right subtree.
     * @param node
     * @return
     */

    public static BalanceChecker isBalanced (BinaryTreeNode<Integer> node){
        BalanceChecker right;
        BalanceChecker left;

        if(node == null)
            return new BalanceChecker(true, -1);

        right = isBalanced(node.right);
        if (!right.isBalanced)
            return right;
        left = isBalanced(node.left);
        if(!left.isBalanced)
            return left;

        Integer height = 1+ Math.max(right.height,left.height);
        Boolean balanced = Math.abs(right.height - left.height) <= 1;
        return new BalanceChecker(balanced,height);

    }


    /**
     *
     * a class helps us to keep an arrayItem
     * along side with its arrayId
     */
    public static class ArrayItem {
        Integer value;
        Integer arrayID;
        public ArrayItem (Integer value, Integer arrayID){
            this.value = value;
            this.arrayID = arrayID;
        }
    }

    /**
     * DEAN RATE 2
     * given K sorted lists,
     * merge them all into one sorted list and return it.
     * Time - O(n log(k))  - n total number of elements of all lists, k number of lists.
     * Space - O(K) (excluding the result array) - because iterators list and heap are size k.
     * @param sortedLists
     * @return
     */
    public static List<Integer> mergeAllLists (List<List<Integer>> sortedLists){
        List<Integer> result = new ArrayList<>();
        //Array of iterator, each for every given sorted list
        ArrayList<Iterator> iterators = new ArrayList<>(sortedLists.size());
        for(List sortedList : sortedLists){
            iterators.add(sortedList.iterator());
        }
        //the way of using a minHeap in JAVA
        PriorityQueue <ArrayItem> minHeap = new PriorityQueue<>(sortedLists.size(), Comparator.comparingInt(o -> o.value));
        int i = 0;
        // insertion of the first iterated element (Integer) of each sorted list
        // into to minHeap
        for(Iterator iter : iterators){
            if(iter.hasNext())
                minHeap.add(new ArrayItem((Integer)iter.next(), i));
            i++;
        }
        // as long as heap contains elements, extract (O(log(sizeofheap))) it into
        // the head of result list. then if in the same list (can check that thanks
        // to the ArrayItem class - specifically its ID) there is some element left,
        // add it to the heap.
        while (! minHeap.isEmpty()){
            ArrayItem toResult = minHeap.peek();
            result.add(minHeap.poll().value);
            if(iterators.get(toResult.arrayID).hasNext())
                minHeap.add(new ArrayItem((Integer)iterators.get(toResult.arrayID).next(),toResult.arrayID));
        }
        return result;

    }

    /**
     * Simple integer comparator, needed for binarySearch.
     */
    public static  Comparator<Integer> intComparator = Integer::compare;

    /** Naive - worse case O(n) - larger than the binarySearch.
     *  finds the first occurence index of a target in
     *  a sorted, with duplicates array.
     * @param inputArray
     * @param target
     * @return
     */

    public static int firstOcurenceNaive (ArrayList<Integer> inputArray, int target){

        int index = Collections.binarySearch(inputArray,target,intComparator);
        while (inputArray.get(index -1).equals(target)){
            index --;
        }
        return index;
    }

    /***
     * DEAN RATE 1
     * Improvement firstOccurence, worst case O(log n).
     */

    public static int firstOcurence (ArrayList<Integer> inputArray, int target){
        int L = 0;
        int U = inputArray.size() - 1;
        int M = -1;
        int result = -1;
        while (L<= U){
            M = (U + L)/ 2;
            if(inputArray.get(M).equals(target)) {
                result = M;
                U = M-1;
            }
            if(inputArray.get(M).compareTo(target) < 0)
                L = M + 1;
            if(inputArray.get(M).compareTo(target) > 0)
                U = M - 1;

        }

        return result;

    }

    /**
     * DEAN RATE 1
     * checking if a letter can be constructed by magazine.
     * Worst case time - O(L + M)
     * Space - if given all chars are ascii then constant,
     * else its the size of the distinct letters in the letter.
     * Small trick - fill the hashMap with the letters letters
     * because it is probably less the the magazine.
     */

    public static boolean canBeConstructed (String letter, String magazine){
        HashMap <Character,Integer> charsApperances = new HashMap<>();
        for (int i = 0; i< letter.length(); i++){
            if(!charsApperances.containsKey(letter.charAt(i)))
                charsApperances.put(letter.charAt(i), 1);
            else
                charsApperances.put(letter.charAt(i), charsApperances.get(letter.charAt(i)) + 1);
        }
        char[] magazineArr = magazine.toCharArray();
        for(char c: magazineArr){
            if(charsApperances.containsKey(c)) {
                charsApperances.put(c, charsApperances.get(c) - 1);
                if (charsApperances.get(c).equals(0)) {
                    charsApperances.remove(c);
                    if (charsApperances.isEmpty())
                        break;
                }

            }
        }
        return charsApperances.isEmpty();

    }

    /**
     * DEAN RATE 1
     * find in O(n+m) , n,m sizes of input arrays, the intersection.
     * Space complex - O(K) size of intersection.
     * NOTE that if m>>n so we can iterate through n and binarySearch
     * each of n's elements in m. this will lead to O(n log m) time solution.
     */

    public static List<Integer> findIntersection (ArrayList<Integer> A, ArrayList<Integer> B){
        List<Integer>result = new ArrayList<>();
        int i=0;
        int j=0;
        while (i < A.size() && j < B.size()){
            if(A.get(i) == B.get(j) && (i==0 || A.get(i)!= A.get(i-1))){
                result.add(A.get(i));
                i++; j++;
            }else if(A.get(i)>B.get(j)){
                j++;
            }else{ //(A.get(i)<B.get(j))
                i++;
            }
        }
        return result;
    }

    /**
     * DEAN RATE 1
     * Additional space O(n) for having bounds for each node,
     * Queue takes at worst case O(n)
     *Time - O(n), BFS.
     *
     */
    public static class TreeEntry {
        BinaryTreeNode<Integer> node;
        Integer upper;
        Integer lower;
        public TreeEntry(BinaryTreeNode<Integer> node, Integer u, Integer l){
            this.node = node;
            upper = u;
            lower = l;
        }
    }

    public static boolean checkBSTWithBFS( BinaryTreeNode tree){
        //no tree is BST
        if( tree == null)
            return true;
        //Queue for BFS
        Queue<TreeEntry> neighbors = new LinkedList<>();
        //Initial bound for root is any number
        TreeEntry curr = new TreeEntry(tree,Integer.MAX_VALUE, Integer.MIN_VALUE);
        neighbors.add(curr);
        //iterate in BFS fashion
        while( ! neighbors.isEmpty()){
            curr = neighbors.remove();
            //the BST constraint check
            if(curr.node.data > curr.upper || curr.node.data < curr.lower)
                return false;
            //adding to the queue left child - upper bound is curr data, lower is curr lower
            if(curr.node.left!=null)
                neighbors.add(new TreeEntry(curr.node.left,curr.node.data, curr.lower));
            //adding to the queue right child - upper is curr upper, lower is curr data
            if(curr.node.right!=null)
                neighbors.add(new TreeEntry(curr.node.right,curr.upper, curr.node.data));
        }
        //if we got here then no violation of constraint has happened :)
        return true;
    }

    /**
     * DEAN RATE 1
     * Class helps us represent hanoi ped on its
     * contents, and its unique ID.
     */

    public static class hanoiPed{
        java.util.Stack<Integer> stack;
        Character ID;
        public hanoiPed(java.util.Stack<Integer> s, Character id) {
            stack = s;
            ID = id;
        }


    }

    /**
     * Given two hanoi peds, move contents from one to another (using a helper ped)
     * @param source
     * @param target
     */

    public static void hanoi (hanoiPed source, hanoiPed target){
        hanoiPed helper = new hanoiPed(new java.util.Stack<>(), 'c');
        helperHanoi (source,target,helper, source.stack.size());
    }

    /**
     * the recursion function - runTime O(2^n) - T(n) = 2T(n-1) + 1 = 2(2T(n-2) + 1)+1 =...= 2^n + n = 2^n.
     * space - O(n) - n is the depth of the recursion stack.
     * @param source
     * @param target
     * @param helper
     * @param numOfRings
     */

    public static void helperHanoi (hanoiPed source, hanoiPed target, hanoiPed helper, Integer numOfRings){
        if(numOfRings == 0)
            return;
        // assuming recursion will move top n-1 rings from source to helper
        helperHanoi(source, helper, target, numOfRings - 1);
        // move biggest ring from source to target
        target.stack.push(source.stack.pop());
        System.out.println("move from "+ source.ID+" to "+ target.ID);
        // now move n-1 from helper into target
        helperHanoi(helper, target, source, numOfRings - 1);






    }

    /**
     * DEAN RATE 3
     * DP - a function which return the number of combination in which
     * each combination can construct a given score.
     * e.g : weight/playScore = {2,3}, score = 6 then should return 2 : 2,2,2 or 3,3.
     * both runtime and space O(sn), s-score, n-number of playScores.
     * @param score
     * @param playScores
     * @return
     */
    public static int numOfCombinationConsructScore (int score, ArrayList<Integer> playScores){
        //initialize a 2D array to have scores from 0 to score
        int [][] aggregatedCombinations = new int[playScores.size()][score+1];
        //loop over playScores
        for (int i=0; i<playScores.size(); i++){
            //all playScores 0 times can give zero, therefore 1 for each of these
            aggregatedCombinations[i][0] = 1;
            //for each play score we either use it or not
            for(int j=1; j<= score; j++){
                //see if we can achieve curr result (j) with the prev playScore
                int withOutPlay = i-1 >= 0 ? aggregatedCombinations[i-1][j]: 0;
                //see if current score is larger than playScore (otherwise we can not take it)
                int withPlay = j >= playScores.get(i) ? aggregatedCombinations[i][j-playScores.get(i)] : 0;
                //update the 2D array for the current score (j) and the play scores (playScore 0,..,i)
                // the number of combination with any of these (separate or together) playScores.
                aggregatedCombinations[i][j] = withOutPlay + withPlay;
            }

        }
        //return the numOfCombinations for score using (some or all) given playScores
        return aggregatedCombinations[playScores.size()-1][score];

    }

    /**
     * DEAN RATE 1
     * given array (unsorted) and sum, return weather there are 3 elements
     * that can add up to sum.
     * Time - O(nlog n)  - sorting the array, then O(n^2) running over each element and then
     * looking for upper and lower to complete it.
     * Space - o(1).
     * @param sum
     * @param list
     * @return
     */
    public static boolean isThreeSum (int sum, ArrayList<Integer> list){
        Collections.sort(list);
        for (int i = 0; i<list.size(); i++){
            int L = 0;
            int U = list.size() -1;
            while(L <= U) {
                if (list.get(U) + list.get(L) == sum - list.get(i))
                    return true;
                else if (list.get(U) + list.get(L) > sum - list.get(i))
                    U--;
                else L++;
            }
        }
        return false;
    }

    /**
     * DEAN RATE 1
     * simple mazeEntry, describes weather its been visited, is it black or white
     * and its coordinate.
     */
    public static class MazeEntry{
        boolean visited;
        boolean isWhite;
        int x;
        int y;
        public  MazeEntry(boolean isWhite, int x, int y, boolean visited){
            this.visited = visited;
            this.isWhite = isWhite;
            this.x = x;
            this.y = y;
        }
    }

    /**
     * DFS way to find if from given entry start we can pass through end.
     * Time - O(V+E),
     * Space - O(V) worst case.
     * @param maze
     * @param start
     * @param end
     * @return
     */
    public static boolean mazeSolver (MazeEntry [][] maze, MazeEntry start, MazeEntry end){
        java.util.Stack<MazeEntry> st = new java.util.Stack<>();
        st.push(start);
        Integer [][] shifts = {{1,0},{0,1},{-1,0},{0,-1}};
        while (! st.empty()){
            MazeEntry visited = st.pop();
            visited.visited=true;
            if(visited.equals(end)){
                return true;
            }
            for (int i=0; i<shifts.length ; i++) {
                int newX = visited.x + shifts[i][0];
                int newY = visited.y + shifts[i][1];
                if ( newX>= 0 && newX < maze[0].length ) {
                    if ( newY >= 0 && newY < maze[0].length) {
                        if(maze[newX][newY].isWhite && !maze[newX][newY].visited)
                            st.push(maze[newX][newY]);
                    }
                }

            }

        }
        return false;

    }

    /**
     * DEAN RATE 2
     * return x^y, O(n) time where n is number of bits in y.
     * space constant.
     *
     * for example x and 5 will become after first iteration :
     *          y=5, result will be x, x will be x^2
     *     second iteration:
     *          y=2, result still x, x will be (x^2)(x^2) = x^4
     *     third:
     *          y=1, result will be x*(x^4)=x^5, x will be (x^4)(x^4) = x^8
     *     fourth:
     *          y=0, done.
     */

    public static double power (double x, int y){
        //every natural number ^ 0 is 1.
        double result = 1;
        if(y<0){
            x = x/1;
            y = -y;
        }
        while (y > 0){
            //if y's lsb is 1, we multiply result by the former x
            if((y & 1) != 0)
                result *= x;
            // take advantage of the fact that x becomes x^2 becomes x^4..., etc.
            x *= x;
            y >>>= 1;

        }
        return result;
    }

    /**
     * DEAN RATE 1
     * Choosing k elements from an array, randomly (each k subset can be chosen uniformly)
     * O(k) time - K rand indexing, then in given array updating elements (O(1) additional space).
     * I will implement it under the assumption that k> n/2. then technically runtime is O(n-k).
     */

    public static void randomSizeKSubset (int k, ArrayList<Integer> A){
        Random rnd = new Random();
        // run over the last n-k element cause its shorter than k
        // and randomly swap each one with one of 0 - k.
        for(int i=A.size()-1; i>=k ; i--){
            // nextInt gives an int between 0 and i for i+1
            Collections.swap(A,i,rnd.nextInt(i+1));
        }

    }

    /**
     * finding the "spiral" representation of 2D array.
     * additional space O(1) (same storage as was asked to return), time - O(n^2) size of the 2D array.
     */
    public static ArrayList <Integer> spiralRepresentation (int [][] A){
        double levels = Math.ceil(A.length * 0.5);
        boolean oddArr = false;
        if(A.length%2 ==1)
            oddArr =true;
        ArrayList<Integer> result = new ArrayList<>();
        for(int currLevel = 0; currLevel < levels; currLevel++){
            if(oddArr && currLevel == levels-1)
                result.add(A[currLevel][currLevel]);
            else {

                for (int upper = currLevel; upper < A.length - 1 - currLevel; upper++) {
                    result.add(A[currLevel][upper]);
                }
                for (int right = currLevel; right < A.length - 1 - currLevel; right++) {
                    result.add(A[right][A.length-1 - currLevel]);
                }
                for (int lower = A.length-1 - currLevel; lower > currLevel; lower--) {
                    result.add(A[A.length -1- currLevel][lower]);
                }
                for (int left = A.length -1- currLevel; left > currLevel; left--) {
                    result.add(A[left][currLevel]);

                }
            }
        }
        return result;
    }

    /**
     * DEAN RATE 2
     * More sophisticated implementation for the same problem
     * Same time & space complex.
     */

    public static ArrayList <Integer> spiralSophistication( int [][]A){
        //going on x to the positive, y to the positive , x to the negative, y to the negative.
        int [][] SHIFT = {{0,1},{1,0},{0,-1},{-1,0}};
        //initial dir is x to the positive
        int dir =0;
        //initial position
        int x=0;
        int y=0;
        //result
        ArrayList<Integer> result = new ArrayList<>();
        //iterating through the whole 2D array
        for(int i = 0; i< A.length * A.length; i++){
            //adding the current element to the result
            result.add(A[x][y]);
            //zeroing the visited element
            A[x][y] = 0;
            // proceeding in our direction
            int newX = x + SHIFT[dir][0];
            int newY = y + SHIFT[dir][1];
            //if hit a wall or a zero it means we need to change direction
            if(newX < 0 || newY < 0 || newX >=A.length || newY >= A.length || A[newX][newY] == 0){
                //for the case  (larger then 3X3) we change direction more times than 4.
                dir = (dir + 1) % 4 ;
                newX = x + SHIFT[dir][0];
                newY = y + SHIFT[dir][1];
            }
            // updating our coordinates.
            x = newX;
            y = newY;

        }
        return result;
    }

    /**
     * DEAN RATE 1
     * Convert number from base b1 to b2.
     * Time - n log base b2 of (b1)
     * Space - O(1) additional
     */
    public static String baseConvert (String number, int b1, int b2){
        if( b1==10 && b2==10){
            return number;
        }
        int decimal = 0;
        boolean isNegative = number.startsWith("-");
        //this is O(n) , n - is string length.
        for(int i = isNegative ? 1:0; i< number.length(); i++){
            decimal *= b1;
            decimal += Character.getNumericValue(number.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        //this is log b2 (b1 ^ n) - n log b2 (b1) (means b2 is base of log)
        // why (b1 ^ n), because decimal is constructed this way : (b1^0)[0-b1-1]+....+(b1^n)[0-b1-1].
        while(decimal > 0){
            sb.append(Integer.toHexString(decimal % b2));
            decimal/= b2;
        }
        if(isNegative)
            sb.append('-');
        sb.reverse();
        return sb.toString();
    }

    /**
     * DEAN RATE 2
     * at the index 0 - k:
     * each a--> dd
     * each b remove
     * O(n) time, O(1) additional space
     */
    public static ArrayList<Character> operationsOnChars (int size, ArrayList<Character> A){

        // first let's count num of a's
        //plus mark places that we can delete
        int aCount = 0;
        int writeIndex = 0;
        for (int i = 0; i<size; i++){
            if(A.get(i)!='b'){
                A.set(writeIndex++, A.get(i));
            }
            if(A.get(i) == 'a')
                aCount++;
        }

        int currIndex = writeIndex -1;
        // writing from the "new" size after adding a's and removing b's
        writeIndex = writeIndex + aCount -1 ;

        while (currIndex >= 0){
            if(A.get(currIndex)=='a'){
                A.set(writeIndex --, 'd');
                A.set(writeIndex --, 'd');
            }else
                A.set(writeIndex--, A.get(currIndex));
            currIndex --;
        }
        return  A;
    }

    /** DEAN RATE 1
     * Add 1 in 0(1) additional space, o(n) runtime to an array
     * represents decimal number.
     * e.g. give <1,2,9> then return --> <1,3,0>.
     */

    public static ArrayList<Integer> addOne (ArrayList<Integer> A){

        A.set(A.size()-1,A.get(A.size()-1)+1);
        for(int i = A.size() -1; i>=0; i--){
            if(A.get(i) == 10 && i>0) {
                A.set(i, 0);
                A.set(i - 1, A.get(i - 1) + 1);
            }else if(i==0 && A.get(i) == 10) {
                A.set(i, 0);
                A.add(0,1);
            }else break;

        }
        return A;
    }


    /**
     * DEAN RATE 2
     * No additional space. time complexity O(End).
     *
     *
     * @param Start
     * @param End
     * @param head
     * @return
     */
    public static ListNode<Integer> reverseSubList (int Start, int End, ListNode <Integer> head){
        if(Start == End)
            return head;
        ListNode dummy = new ListNode(0, head);
        int i = 0;
        while (i++ < Start){
            head = dummy.next;
        }
        ListNode iter = head.next;
        while(Start ++ < End){
            ListNode tmp = iter.next;
            iter.next = tmp.next;
            tmp.next = head.next;
            head.next = tmp;

        }
        return dummy.next;


    }

    /**
     * DEAN RATE 2
     * O(m) space complexity where m is the largest level of nodes.
     * O(n) time complexity.
     * @param root
     * @return
     */
    public static List<List<Integer>> getTreeByLevel (BinaryTreeNode <Integer> root){
        Queue <BinaryTreeNode<Integer>> currentLevel = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        currentLevel.add(root);
        while (!currentLevel.isEmpty()){
                Queue <BinaryTreeNode<Integer>> nextLevel = new LinkedList<>();
                List<Integer> thisLevel = new ArrayList<>();
                while (! currentLevel.isEmpty()){
                    BinaryTreeNode <Integer> curr = currentLevel.poll();
                    if(curr!=null) {
                        thisLevel.add(curr.data);
                        nextLevel.add(curr.left);
                        nextLevel.add(curr.right);
                    }
                }
                if(!thisLevel.isEmpty())
                    result.add(thisLevel);
                currentLevel = nextLevel;

        }
        return result;
    }
    /*
    DEAN RATE 1 - avoids busy locking by the wait() and notify() pattern.
    */
    public static class Monitor{
        boolean isOdd = true;

        public synchronized void switchFlag (){
            this.isOdd ^= true;
            notify();
        }
        public synchronized void  waitForOther(boolean Turn) throws InterruptedException {
            while (isOdd!=Turn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static class OddThread extends Thread{
        Monitor monitor;

        public  OddThread(Monitor monitor){
            this.monitor = monitor;
        }
        @Override
        public void run() {
            for(int i=1; i<100; i=i+2) {
                try {
                    monitor.waitForOther(true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                monitor.switchFlag();
            }
        }
    }

    public static class EvenThread extends Thread{
        Monitor monitor;

        public  EvenThread(Monitor monitor){
            this.monitor = monitor;
        }
        @Override
        public void run() {
            for(int i=2; i<=100; i=i+2) {
                    try {
                        monitor.waitForOther(false);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                   System.out.println(i);
                   monitor.switchFlag();

            }
        }
    }

    /**
     * DEAN RATE 1
     * finding in O(h) - h is the height of the tree - the LCA (lowest common ancestor)
     * of two given nodes of the tree. Constant additional space.
     * @param n1
     * @param n2
     * @return
     */
    public static BinaryTreeNode<Integer> findLCA (BinaryTreeNode<Integer> n1, BinaryTreeNode<Integer> n2){
        if(n1.equals(n2))
            return n1;
        int n1Depth = -1;
        int n2Depth = -1;
        while (n1 != null) {
            n1Depth++;
            n1 = n1.parent;
        }
        while (n2 != null) {
            n2Depth++;
            n2 = n2.parent;
        }
        int delta = n1Depth > n2Depth ? n1Depth - n2Depth : n2Depth - n1Depth;
        boolean n1IsDeeper = n1Depth > n2Depth;
        while (delta > 0){
            if(n1IsDeeper)
                n1=n1.parent;
            else n2=n2.parent;
            delta --;

        }
        while(!n1.equals(n2)){
            n1=n1.parent;
            n2=n2.parent;
        }

        return n1;


    }

    /**
     * DEAN RATE 2
     * SPACE O(K), TIME O(n log k) -  worst case is adding each star to the max heap.
     */
    public static class Star implements Comparable <Star>{
        int x;
        int y;
        int z;
        String name;
        public Star (int x, int y, int z, String name){
            this.x = x;
            this.y = y;
            this.z = z;
            this.name = name;
        }
        public double distOfStar (){
            return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        }

        @Override
        public int compareTo(Star o) {
            return Double.compare(this.distOfStar(),o.distOfStar());
        }

    }


    public static ArrayList<String> findKClosestStars (ArrayList<Star> STARS, int k){
        ArrayList<String> result = new ArrayList<>();
        PriorityQueue <Star> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i=0; i<STARS.size(); i++){
            maxHeap.add(STARS.get(i));
            if(maxHeap.size() == k+1)
                maxHeap.poll();
        }
        for (int i=0; i<k; i++){
            result.add(maxHeap.poll().name);
        }
        return result;
    }

    /**
     * DEAN RATE 1
     * O(log k) - k is the input int - runTime, constant space.
     * usage of binary search to find the int sqrt of k.
     * Search range is [0,k], then if M*M > K --> [0, M-1] etc.
     * @param k
     * @return
     */
    public static int sqrt (int k){
        int L = 0;
        int U = k;
        while (L <= U){
            int M = (U+L)/2 ;
            if (M*M == k){
                return M;
            }
            if(M*M > k){
                U = M-1;
            }else {
                L = M + 1;
            }
        }
        return U+1;
    }

    /**
     * DEAN RATE 2
     * Additional space is O(1), Time is : T(n) = O(n) + T(n/2) on average which is O(n).
     * Worst time case is T(n)= O(n) + T(n-1) which is O(n^2)
     * @param A
     * @param k
     * @return
     */
    public static Integer findKthLargest (ArrayList<Integer> A, int k) {
        int L = 0;
        int U = A.size() - 1;
        Random rnd = new Random();
        int pivotIndex = rnd.nextInt(A.size());
        //O(n)
        int newPivotIndex = getNewPivotIndex(A,L,U,pivotIndex);

        while(newPivotIndex != A.size()-k){
            if(newPivotIndex > A.size() - k){
                pivotIndex = rnd.nextInt(newPivotIndex-L) + L;
                //T(n/2) on average, worst case, the random is the largest element and then no sorting has happened
                // then it is T(n-1)
                newPivotIndex = getNewPivotIndex(A,L,newPivotIndex-1,pivotIndex);
            }
            else if (newPivotIndex < A.size() - k){
                pivotIndex = rnd.nextInt(U - newPivotIndex) + newPivotIndex+1;
                newPivotIndex = getNewPivotIndex(A,newPivotIndex+1,U,pivotIndex);
            }
        }
        return A.get(newPivotIndex);
    }

    public static int getNewPivotIndex (ArrayList<Integer>A, int L, int U, int pivotIndex){
        int tmp = A.get(pivotIndex);
        while(L<U){
            if(A.get(L)<tmp){
                L++;
            }
            else if (A.get(L)>tmp){
                Collections.swap(A,L, U);
                U--;
            } else {
                Collections.swap(A,L,U);
            }

        }
        return L;
    }

    public static int multiply (int x, int y){
        int sum = 0;
        while(x!=0){
            if((x& 1) !=0)
                sum+= y;
            x>>=1;
            y<<=1;

        }
        return sum;
    }

}