
package functions;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.util.logging.Logger;

import java.io.BufferedWriter;
import java.io.IOException;

public class HelloWorld implements HttpFunction {
  private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());

  @Override
  public void service(HttpRequest request, HttpResponse response)
      throws IOException {
    logger.info("Running the HelloWorld service.");
    BufferedWriter writer = response.getWriter();
    writer.write("Hello World!\n\n");
    writer.newLine();
    writer.write(System.getenv().toString());
  }
}
