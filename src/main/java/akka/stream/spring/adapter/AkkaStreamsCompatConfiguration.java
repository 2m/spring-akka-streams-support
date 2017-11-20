package akka.stream.spring.adapter;

import akka.actor.ActorSystem;
import akka.event.Logging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;


@Configuration
public class AkkaStreamsCompatConfiguration {

  @Autowired
  public AkkaStreamsCompatConfiguration(RequestMappingHandlerAdapter requestMappingHandlerAdapter) {
    final ReactiveAdapterRegistry registry = requestMappingHandlerAdapter.getReactiveAdapterRegistry();

    final ActorSystem system = ActorSystem.create(Logging.simpleName(AkkaStreamsCompatConfiguration.class));
    new AkkaStreamsRegistrar(system).registerAdapters(registry);
  }
  
}


