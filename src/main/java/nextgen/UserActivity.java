package nextgen;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class UserActivity {
	
	@Id
	private String id;
	private String actionByGroup;
	private String actionByUser;
	private Date actionAt = new Date();
	private String actionType;
	private String result;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActionByGroup() {
		return actionByGroup;
	}
	public void setActionByGroup(String actionByGroup) {
		this.actionByGroup = actionByGroup;
	}
	public String getActionByUser() {
		return actionByUser;
	}
	public void setActionByUser(String actionByUser) {
		this.actionByUser = actionByUser;
	}
	public Date getActionAt() {
		return actionAt;
	}
	public void setActionAt(Date actionAt) {
		this.actionAt = actionAt;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "UserActivity [id=" + id + ", actionByGroup=" + actionByGroup + ", actionByUser=" + actionByUser
				+ ", actionAt=" + actionAt + ", actionType=" + actionType + ", result=" + result + "]";
	}
	
	
}
