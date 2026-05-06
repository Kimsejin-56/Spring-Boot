package hello.order.v1;

import hello.order.v0.OrderServiceV0;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV1 {

    @Bean
    OrderServiceV1 orderServiceV1(MeterRegistry registry) {
        return new OrderServiceV1(registry);
    }
}
