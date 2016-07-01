package com.byteowls.vaadin.chartjs;

import com.byteowls.vaadin.chartjs.config.ChartConfig;
import com.byteowls.vaadin.chartjs.config.LineChartConfig;
import com.byteowls.vaadin.chartjs.options.AnimationOptions;
import com.byteowls.vaadin.chartjs.options.HoverOptions;
import com.byteowls.vaadin.chartjs.options.TitleOptions;
import com.byteowls.vaadin.chartjs.options.TooltipsOptions;
import elemental.json.JsonValue;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author michael@team-conductor.com
 */
public class ChartJsTest {

  @Test
  public void testConfigGeneral() {

      ChartConfig config = new LineChartConfig()
          .options()
            .events("test", "test1")
            .showLines(true)
            .responsive(true)
            .hover()
              .mode(HoverOptions.Mode.SINGLE)
              .done()
            .title()
              .display(true)
              .position(TitleOptions.Position.TOP)
              .text("Hello World")
              .done()
            .animation()
              .easing(AnimationOptions.Easing.easeOutQuart)
              .done()
            .tooltips()
              .mode(TooltipsOptions.Mode.LABEL)
              .done()
            .scales()
              .addXAxes()
              .done()
            .done();

    JsonValue jsonValue = config.buildJson();
    Assert.assertNotNull(jsonValue);
  }

}
