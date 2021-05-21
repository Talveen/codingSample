package spring.common;/*
    Created By: Talveen Rakhra
    Created On: 12-05-2021
    Question URL:
    Time Taken:
    Complexity:
*/

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import spring.util.Secured;

@Aspect
@Component
public class SampleAspect {

    @Pointcut("@annotation(secured)")
    public void callAt(Secured secured) {
        System.out.println("callAt(Secured secured) ");
    }

    @Around("callAt(secured)")
    public Object around(ProceedingJoinPoint pjp,
                         Secured secured) throws Throwable {
        System.out.println("checking if secured");
        return secured.isLocked() ? null : pjp.proceed();
    }
}
