package aspect_homework.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @After("execution(* aspect_homework.dao.AlbumDaoSimple.*(..))")
    public void logBefore_AlbumDAO(JoinPoint joinPoint) {
        System.out.println("Вызов метода : " + joinPoint.getSignature().getName());
    }
    @Before("execution(* aspect_homework.service.AlbumFilter.*(..))")
    public void logBefore_AlbumFilter(JoinPoint joinPoint) {
        System.out.println("Вызов метода : " + joinPoint.getSignature().getName());
    }
}
