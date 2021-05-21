package spring.util;/*
    Created By: Talveen Rakhra
    Created On: 12-05-2021
    Question URL:
    Time Taken:
    Complexity:
*/

public class SecuredMethod {

    @Secured(isLocked = true)
    public void lockedMethod() {
    }

    @Secured(isLocked = false)
    public void unlockedMethod() {
    }

}
