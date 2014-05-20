package project.features;

import org.fluentlenium.adapter.FluentTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = project.Application)
@IntegrationTest
@WebAppConfiguration
abstract class BaseFluent extends FluentTest {
}
