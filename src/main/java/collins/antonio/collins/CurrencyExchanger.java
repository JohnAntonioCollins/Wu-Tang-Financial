package collins.antonio.collins;


/**
 * Created by johncollins on 1/12/17.
 */
public class CurrencyExchanger {
    /*Double usDollar = 1.00;
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
    */
    public Double inputCountry;
    public Double outputCountry;
    public Double inputAmount;
    //public Double outputAmount;

    public Double currencyExchanger( Double inputCountry, Double outputCountry, Double inputAmount){
            return (outputCountry / inputCountry) * inputAmount;

    }
}

//constructor:
