package com.openwallet.core.coins;

import com.openwallet.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class QuebecoinMain extends BitFamily {
    private QuebecoinMain() {
        id = "quebecoin.main";

        addressHeader = 58;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 6;
        dumpedPrivateKeyHeader = 186;

        name = "Quebecoin";
        symbol = "QBC";
        uriScheme = "quebecoin";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 QBC mininput
        softDustLimit = value(100000); // 0.001 QBC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Quebecoin Signed Message:\n");
    }

    private static QuebecoinMain instance = new QuebecoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
