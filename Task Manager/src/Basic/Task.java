package Basic;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private static int nextTaskId = 1;
    private int taskId;
    private String taskName;
    private String description;
    private LocalDate taskDate;
    private Status status;
    private boolean active;

    public Task(String taskName, String description, LocalDate taskDate) {
        this.taskId = nextTaskId++;
        this.taskName = taskName;
        this.description = description;
        this.taskDate = taskDate;
        this.status = Status.PENDING;
        this.active = true;
    }

    public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public Status getStatus() {
        return status;
    }

    @Override
	public int hashCode() {
		return Objects.hash(taskName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(taskName, other.taskName);
	}

	public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", taskDate=" + taskDate +
                ", status=" + status +
                ", active=" + active +
                '}';
    }
}

