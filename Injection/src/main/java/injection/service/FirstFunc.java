package injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstFunc {

    @Autowired
    SecondFunc secondFunc_1;

    SecondFunc secondFunc;

    SecondFunc secondFunc_2;
    @Autowired
    public FirstFunc(SecondFunc secondFunc){
        this.secondFunc = secondFunc;
    }

    @Autowired
    public SecondFunc setSecondFunc(SecondFunc secondFunc) {
        return secondFunc_2 = secondFunc;
    }

    public void books(String book, String title){
        System.out.println(secondFunc.book(book, title));
        System.out.println(secondFunc_1.book(book, title));
        System.out.println(setSecondFunc(secondFunc_2).book(book, title));
    }
}
