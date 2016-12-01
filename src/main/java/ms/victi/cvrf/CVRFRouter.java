package ms.victi.cvrf;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.YAMLLibrary;
import org.springframework.stereotype.Component;

@Component
public class CVRFRouter extends RouteBuilder{

        @Override
        public void configure() throws Exception {
            from("{{from.endpoint}}")
                .unmarshal().yaml(YAMLLibrary.SnakeYAML)
                    .to("stream:out");
        }
}
