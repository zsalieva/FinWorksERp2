package com.cybertek.utilities;

import com.cybertek.pages.activity_stream.TasksPage;
import com.cybertek.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private TasksPage tasksPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }



    public TasksPage tasksPage() {
        if (tasksPage == null) {
            tasksPage = new TasksPage();
        }
        return tasksPage;
    }


}
