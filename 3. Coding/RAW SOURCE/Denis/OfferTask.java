public class OfferTask extends Task {

	private int taskID;
	private TaskType taskType;
	private boolean completed;
	private Offer offer;

	public int getTaskID() {
		return this.taskID;
	}

	/**
	 * 
	 * @param taskID
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public TaskType getTaskType() {
		return this.taskType;
	}

	/**
	 * 
	 * @param taskType
	 */
	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public boolean isCompleted() {
		return this.completed;
	}

	/**
	 * 
	 * @param completed
	 */
	public void changeCompleted(boolean completed) {
		// TODO - implement OfferTask.changeCompleted
		throw new UnsupportedOperationException();
	}

	public Offer getOffer() {
		return this.offer;
	}

	/**
	 * 
	 * @param offer
	 */
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

}