package kukka.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "payment", url = "${api.url.payment}")
public interface PaymentService {

    @RequestMapping(method = RequestMethod.GET, path = "/payments")
    public void payment(@RequestBody Payment payment);

}
