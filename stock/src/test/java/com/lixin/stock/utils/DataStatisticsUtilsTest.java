package com.lixin.stock.utils;

import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.junit.jupiter.api.Test;


class DataStatisticsUtilsTest {

    double[] values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501,

            0.444, 0.44, 0.34496, 0.33,0.3, 0.292, 0.667 };

  /*  @BeforeEach
    void setUp() {
    }*/

   @Test
   public void testGetVariance(){
       Variance variance = new Variance();
       System.out.println("copy+"+DataStatisticsUtils.getVariance(values));
       System.out.println("common"+variance.evaluate(values));
   }
}