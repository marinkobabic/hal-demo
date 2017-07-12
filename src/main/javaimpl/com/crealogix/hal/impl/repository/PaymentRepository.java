package com.crealogix.hal.impl.repository;

import com.crealogix.hal.model.Payment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marinko on 11.07.2017.
 */
@Component
public class PaymentRepository {
    public List<Payment> getAll(){
        ArrayList<Payment> all = new ArrayList<>();

        Payment payment = new Payment();
        payment.setId(1);
        payment.setAccountId(15);
        payment.setAmount(Float.valueOf(100));
        all.add(payment);

        payment = new Payment();
        payment.setId(2);
        payment.setAccountId(20);
        payment.setAmount(Float.valueOf(200));

        all.add(payment);

        payment = new Payment();
        payment.setId(3);
        payment.setAccountId(20);
        payment.setAmount(Float.valueOf(1200));

        all.add(payment);
        return all;
    }
}
