package org.liko.ssh.action;

import org.liko.ssh.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 8487308730974032921L;

	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Action...");
		userService.add();
		return NONE;
	}
}
