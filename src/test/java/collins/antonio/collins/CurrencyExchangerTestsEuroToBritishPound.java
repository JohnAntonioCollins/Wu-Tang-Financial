package collins.antonio.collins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CurrencyExchangerTestsEuroToBritishPound {

    CurrencyExchanger exchanger;

    @Before
    public void setUp() {
        exchanger = new CurrencyExchanger();
    }

    @Test
    public void CurrencyExchangerTests() {
        //arrange
        /*
        Double usDollar = 1.00;
        Double euro	= 0.94;
        Double britishPound	= 0.82;
        Double indianRupee	= 68.32;
        Double australianDollar=	1.35;
        Double canadianDollar	= 1.32;
        Double singaporeDollar	= 1.43;
        Double swissFranc	= 1.01;
        Double malaysianRinggit	= 4.47;
        Double japaneseYen	= 115.84;
        Double chineseYuanRenminbi	= 6.92;

        There MUST be Unit test testing the following scenarios:

        Convert Dollar to Euro
        Convert Euro to Dollar
        Convert Euro to British Pound
        Convert British Pound to Indian Rupee
        Convert Rupee to Canadian Dollar
        Convert Canadian Dollar to Singapore Dollar
        Convert Singapore Dollar to Swiss Franc
        Convert Swiss Franc to Malaysian Ringgit
        Convert Malaysian Ringgit to Japanese Yen
        Convert Japanese Yen to Chinese Yuan Renminbi
        */

        //Convert Euro to British Pounds
        Double inputCountry = .94;
        Double outputCountry = .82;
        Double inputAmount = 1000.00;

        Double outputAmount = 872.34; //expected based on above input values
        Double actual = exchanger.currencyExchanger(inputCountry, outputCountry, inputAmount);
        assertEquals(outputAmount, actual, .1);

           }

}

