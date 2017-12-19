public abstract class Task {

	private int taskID;
	private TaskType taskType;
	private boolean completed;

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
		// TODO - implement Task.changeCompleted
		throw new UnsupportedOperationException();
	}

}