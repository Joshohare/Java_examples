public class Queue {

	private int front = queueSize - 1, back = queueSize - 1, length = 0;
		/* front is the front pointer for the queue, back is the rear pointer for the queue,
		   length is the number of values in the queue */

	private int[] queue = new int[queueSize];
		/* array to store the queue elements with an index in between the front pointer
		   and the back pointer. */
	
	private boolean ERROR_FREE = true;
		/* a flag that indicates if there are any errors, so the program can determine weather to run or not
			"true" indicates the queue is error free */

	private final static int queueSize = 5;
		/* queueSize is the maximum number of elements that can be stored in the queue */

	public boolean isEmpty() {
		return length == 0;
	}

	public boolean isFull() {
		return (length == queueSize);
	}

	public boolean isErrorFree() {
		return ERROR_FREE;
	}

	public void Empty() {
		front = queueSize - 1;
		back = queueSize - 1;
		length = 0;
		ERROR_FREE = true;
	}

	public int dequeue() {
		ERROR_FREE = !(isEmpty()) & (ERROR_FREE);
		if (ERROR_FREE) { /* reduces the number of values in the array if it is error free;
							  for efficiency the element remains in the array */
			length--;
			if (front == queueSize - 1) { /* if the front pointer is at the limit of the queue's size
											 it loops around to point at the front of the array */
				front = 0;
			} else {
				front++;
			}
			return queue[front]; /* returns the front element of the queue if it is safe and error free */
		} else {
			return 0; /* indicate an error */
		}
	}

	public void enqueue(int value) {
		ERROR_FREE = !(isFull()) & ERROR_FREE;
		if (ERROR_FREE) { /* increases the number of values in the array if it is error free */
			length++;
			if (back == queueSize - 1) { /* changes the value of the rear pointer to match the rear value;
											checks if the value needs to be looped round to the front of the queue*/
				back = 0;
			} else {
				back++;
			}
			queue[back] = value;
		}
	}
}