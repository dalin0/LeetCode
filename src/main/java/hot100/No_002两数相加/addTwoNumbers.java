package hot100.No_002两数相加;

/**
 * @题目：
 *      给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *      请你将两个数相加，并以相同形式返回一个表示和的链表。
 *      你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @样例：
 *      输入：l1 = [2,4,3], l2 = [5,6,4]
 *      输出：[7,0,8]
 *      解释：342 + 465 = 807.
 */

/**
 * @思路：
 *      1、先建立一个头结点，然后新建一个指针 p 指向该头结点
 *      2、然后新建一个 变量用来表示两个结点数值的和
 *      3、进行循环，判断 l1 或者 l2 或者 是否有进位（bitVal ！= 0）
 *      4、新建变量 val1 和 val2 分别判断 l1 和 l2 是否为 null， 是则为 0， 不为空则将 val 赋值给 新建变量
 *      5、将两个 val1 和 val2 相加 赋值给 bitVal
 *      6、新建一个链表，初始化第一个结点时，赋值 bitVal
 *      7、p.next 指向新建链表 node 的下一个结点
 *      8、p指向的该结点已经取得了最终值， p 再往前走 p = p.next
 *      9、判断 l1 和 l2 是否为空，不为空向下走
 *      10、最后返回头结点 head
 */

/**
 * @讲解链接：
 *      https://www.bilibili.com/video/BV1ta411a7UK?p=2&vd_source=52b395a10caa9649f10cfbd6b0b6651f
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class addTwoNumbers {

    /**
     * 方法一
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            ListNode p = head;
            int bitVal = 0;
            while(l1 != null || l2 != null || bitVal != 0){
                int val1 = l1 == null ? 0 : l1.val;
                int val2 = l2 == null ? 0 : l2.val;
                bitVal = bitVal + val1 + val2;
                ListNode node = new ListNode(bitVal % 10);
                p.next = node;
                p = p.next;
                bitVal /= 10;
                if(l1 != null){
                    l1 = l1.next;
                }
                if(l2 != null){
                    l2 = l2.next;
                }
            }
            return head.next;
    }

    /**
     * @方法二
     */
    public static ListNode addTwoNumbersNoTwo(ListNode l1, ListNode l2) {
        // 每一次加法进位的结果 （0 or 1）
        int bitVal = (l1.val + l2.val) / 10;
        // 每一次加法的最终结果
        int resVal = (l1.val + l2.val) % 10;
        // 用第一位的最终结果初始化新建链表的第一个结点
        ListNode resNode = new ListNode(resVal);
        // 初始化尾结点
        ListNode p = resNode;
        // 因为已经初始化了最终结果的头结点（用到了 l1 和 l2 的链表的头结点）
        l1 = l1.next;
        l2 = l2.next;
        // 保证 l1 和 l2 的结点都没有遍历完
        while (l1 != null && l2 != null){
            // 计算当前位置的结果
            resVal = (l1.val + l2.val + bitVal) % 10;
            bitVal = (l1.val + l2.val + bitVal) / 10;
            ListNode node = new ListNode(resVal);
            p.next = node;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            resVal = (l1.val + bitVal) % 10;
            bitVal = (l1.val + bitVal) / 10;
            ListNode node = new ListNode(resVal);
            p.next = node;
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null){
            resVal = (l2.val + bitVal) % 10;
            bitVal = (l2.val + bitVal) / 10;
            ListNode node = new ListNode(resVal);
            p.next = node;
            p = p.next;
            l2 = l2.next;
        }
        if (bitVal != 0){
            ListNode node = new ListNode(bitVal);
            p.next = node;
            p = p.next;
        }
        return resNode;
    }

}
