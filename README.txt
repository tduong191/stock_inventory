NAME:
=====
	Trang Duong

Programs Files:
===============
    Part 1: ArrayStack (StackIntf.java and ArrayStackHW5.java)
        StackIntf.java: An interface defineition for the Stack data type
        ArrayStackHW5.java: An implementation of a stack using an underlying array

    Part 2: Map151 (Map151.java and Map151Interface.java)
        Map151Interface.java: An interface for mapping classes. 
        Map151.java: An interplementation of a map.
    
    Part 3: ReadCSV.java
        A class that knows how to read CSV files.

    Part 4: Stock.java
        A class that holds stock price.
    
    Part 5: Trade.java
        A class that holds a trade information like quantity, date, and company that the trade is associated.

    Part 6: CapitalGain.java
        A class that calculate capital gain of a list of trades using a list of prices of a company's stock by date.

    Part 7: MultipleCapitalGain.java
        A class that calculate capital gain of a list of trades using many list of prices that stocks were traded by date in each company.
	
How to Compile:
===============
    Part 1: ArrayStack (StackIntf.java and ArrayStackHW5.java)
        javac StackIntf.java
        javac ArrayStackHW5.java

    Part 2: Map151 (Map151.java and Map151Interface.java)
        javac Map151Interface.java
        javac Map151.java
    
    Part 3: ReadCSV.java
        javac ReadCSV.java

    Part 4: Stock.java
        javac Stock.java
    
    Part 5: Trade.java
        javac Trade.java

    Part 6: CapitalGain.java
        javac CapitalGain.java

    Part 7: MultipleCapitalGain.java
        javac MultipleCapitalGain.java

How to Run:
===========
    Part 1: ArrayStack (StackIntf.java and ArrayStackHW5.java)
        java StackIntf.java
        java ArrayStackHW5

    Part 2: Map151 (Map151.java and Map151Interface.java)
        java Map151Interface
        java Map151
    
    Part 3: ReadCSV.java
        java ReadCSV

    Part 4: Stock.java
        java Stock
    
    Part 5: Trade.java
        java Trade

    Part 6: CapitalGain.java
        java CapitalGain

    Part 7: MultipleCapitalGain.java
        java MultipleCapitalGain
	
Output:
===========
    1.  (Part 2 - one stock price list) Show the capital gains resulting from each sale as well as the total capital gains from baA.csv trade file. 
        To get the output, compile and run the Part 6: CapitalGain.java. We would get the following output:
        661 SELL 354 net -6060.480000000001
        1144 Sell 29 net 1367.3500000000001
        1144 SELL 252 net 8625.960000000005
        1611 SELL 48 net 1034.88
        2094 SELL 106 net -563.9199999999993
        2384 Sell 14 net 62.44000000000011
        2384 SELL 45 net 913.5000000000005
        2772 SELL 111 net -3872.7899999999986
        Total net Capital Gains = 1506.9400000000064
        Shares Remaining = 10071

    2. (Part 3 - multiple stock price lists) Show the capital gains resulting from each sale as well as the total capital gains from baA.csv trade file. 
        To get the output, compile and run the Part 7: MultipleCapitalGain.java. We would get the following output:
        3 SELL 392 from A net -662.4799999999991
        5 SELL 383 from C net -1263.9000000000044
        55 Sell 257 from C net 411.20000000000584
        55 SELL 228 from C net 34.200000000001296
        56 SELL 176 from A net 126.7199999999998
        63 SELL 64 from C net 188.79999999999927
        119 SELL 288 from C net 0.0
        139 SELL 409 from A net 883.4399999999986
        176 Sell 328 from C net -1312.0
        176 SELL 110 from C net -782.0999999999983
        225 SELL 14 from B net 14.0
        252 SELL 15 from A net -0.5999999999998806
        269 Sell 225 from B net 616.4999999999997
        269 Sell 165 from B net 82.5
        269 SELL 37 from B net 9.620000000000058
        272 Sell 191 from C net -662.7699999999998
        272 Sell 100 from C net -1712.9999999999995
        272 Sell 147 from C net -5018.579999999998
        272 SELL 2 from C net -81.86000000000001
        302 SELL 471 from C net -18943.62
        318 Sell 226 from B net -137.85999999999987
        318 SELL 199 from B net 127.36000000000011
        329 SELL 184 from C net -10015.12
        371 Sell 91 from C net 2637.179999999999
        371 SELL 39 from C net 403.2600000000001
        378 SELL 96 from A net 2840.6400000000003
        400 SELL 118 from C net 375.23999999999745
        407 Sell 275 from B net 16.500000000000625
        407 SELL 91 from B net 832.6499999999999
        431 Sell 38 from A net 50.540000000000475
        431 SELL 288 from A net 2986.5600000000013
        450 SELL 51 from A net 537.0300000000001
        476 SELL 49 from C net -479.22
        509 Sell 32 from C net -348.16000000000076
        509 Sell 304 from C net -4286.400000000007
        509 SELL 42 from C net 1139.4599999999998
        526 SELL 298 from B net -330.77999999999986
        544 Sell 148 from B net -352.24000000000035
        544 SELL 187 from B net -426.36000000000024
        584 Sell 352 from B net -10.5600000000004
        584 SELL 35 from B net -92.40000000000002
        590 SELL 367 from A net 1181.7399999999996
        593 Sell 220 from A net 81.39999999999475
        593 Sell 57 from A net 161.3099999999991
        593 SELL 25 from A net 299.25
        598 Sell 235 from C net 17726.050000000003
        598 SELL 58 from C net 609.5799999999995
        614 Sell 54 from B net -257.0399999999999
        614 Sell 94 from B net 23.5
        614 Sell 106 from B net 23.320000000000256
        614 SELL 2 from B net 2.440000000000005
        696 SELL 250 from C net -1532.4999999999989
        731 SELL 326 from C net 3292.599999999998
        744 SELL 80 from B net 21.59999999999968
        756 Sell 214 from B net 53.5
        756 SELL 28 from B net 87.36000000000003
        757 Sell 48 from A net -327.8400000000006
        757 SELL 33 from A net 724.6799999999998
        773 SELL 286 from B net 291.71999999999986
        775 SELL 23 from A net 482.3100000000003
        781 Sell 201 from B net 381.8999999999997
        781 SELL 18 from B net -1.080000000000041
        794 SELL 91 from A net 1945.5800000000008
        810 SELL 402 from C net -964.8000000000022
        866 SELL 395 from C net 7343.050000000001
        898 Sell 16 from A net 175.51999999999998
        898 Sell 307 from A net 4982.610000000006
        898 SELL 27 from A net 1075.9500000000003
        900 Sell 235 from A net 10840.550000000003
        900 SELL 183 from A net 6342.78
        931 SELL 103 from A net 65.9199999999986
        940 Sell 216 from B net -619.9199999999994
        940 SELL 13 from B net 30.03000000000003
        954 SELL 105 from A net 36.7499999999994
        985 Sell 263 from C net -349.7899999999958
        985 Sell 16 from C net -286.4000000000001
        985 Sell 50 from C net -277.49999999999915
        985 SELL 148 from C net 2505.6400000000012
        991 Sell 291 from C net 2197.0500000000034
        991 SELL 4 from C net 10.759999999999991
        1045 Sell 197 from C net 1180.0300000000018
        1045 SELL 53 from C net 742.0
        1053 Sell 214 from B net 564.9600000000002
        1053 Sell 32 from B net 201.27999999999997
        1053 SELL 254 from B net 2390.14
        1080 SELL 147 from A net 1245.09
        1091 Sell 223 from A net 4272.679999999999
        1091 SELL 68 from A net 1095.480000000001
        1110 SELL 156 from C net -291.7199999999963
        1147 Sell 220 from C net -1636.7999999999995
        1147 Sell 114 from C net -2081.639999999999
        1147 Sell 20 from C net -383.19999999999993
        1147 SELL 123 from C net -3255.81
        1149 Sell 45 from C net -1077.7499999999995
        1149 SELL 32 from C net -667.8400000000001
        1195 Sell 70 from C net -238.69999999999976
        1195 Sell 258 from C net -6264.240000000001
        1195 SELL 88 from C net -2318.7999999999993
        1196 SELL 131 from C net -3556.6500000000005
        1204 Sell 136 from B net -684.0800000000002
        1204 Sell 30 from B net -94.49999999999996
        1204 SELL 73 from B net 562.0999999999999
        1241 Sell 37 from C net 175.00999999999962
        1241 SELL 396 from C net -8446.680000000006
        1247 SELL 299 from C net -6362.72
        1278 SELL 289 from C net -5872.479999999998
        1306 SELL 125 from A net -89.99999999999986
        1310 SELL 483 from C net -15813.420000000004
        1319 SELL 457 from C net -15816.770000000006
        1350 Sell 408 from C net -1032.2400000000005
        1350 SELL 77 from C net -2742.7400000000002
        1360 Sell 56 from B net 550.4800000000001
        1360 Sell 62 from B net 556.1400000000001
        1360 Sell 153 from B net 1571.3100000000004
        1360 SELL 161 from B net 1638.9800000000005
        1360 Sell 12 from B net 122.16000000000004
        1360 Sell 48 from B net 516.48
        1360 SELL 54 from B net 588.6000000000001
        1370 SELL 256 from B net 2588.1600000000008
        1372 SELL 148 from C net -6223.4000000000015
        1382 SELL 380 from C net -16967.000000000004
        1467 Sell 103 from B net -28.840000000000117
        1467 Sell 9 from B net -40.5
        1467 SELL 347 from B net 1898.0900000000008
        1509 SELL 407 from C net -3968.25
        1548 Sell 47 from B net 33.37000000000004
        1548 Sell 131 from B net 324.8799999999996
        1548 SELL 89 from B net 624.78
        1551 Sell 3 from A net 9.95999999999998
        1551 SELL 93 from A net 2192.9399999999987
        1558 SELL 197 from B net 1294.2900000000006
        1575 SELL 418 from B net 2457.8399999999997
        1613 Sell 161 from A net -2133.25
        1613 SELL 148 from A net 2400.56
        1636 SELL 152 from C net 370.87999999999965
        1673 SELL 90 from B net 36.89999999999969
        1684 SELL 260 from A net 1796.6000000000065
        1687 SELL 70 from B net 135.09999999999997
        1705 Sell 35 from B net -11.54999999999994
        1705 Sell 20 from B net 33.19999999999993
        1705 SELL 80 from B net 541.5999999999999
        1739 SELL 443 from B net 3101.0000000000014
        1743 SELL 15 from A net 518.7000000000002
        1759 SELL 444 from C net 4471.079999999997
        1767 Sell 9 from C net 44.5499999999999
        1767 SELL 188 from C net -3893.4800000000014
        1780 Sell 236 from A net -743.4000000000013
        1780 SELL 136 from A net 4584.560000000001
        1789 SELL 370 from B net 2789.800000000001
        1800 Sell 23 from A net 561.4300000000005
        1800 Sell 53 from A net 2011.8800000000003
        1800 SELL 122 from A net 5321.64
        1819 SELL 33 from B net 240.90000000000003
        1857 Sell 216 from A net 1665.3600000000017
        1857 SELL 132 from A net 7201.92
        1867 Sell 302 from C net -1295.5799999999977
        1867 SELL 35 from C net -964.9499999999998
        1899 SELL 53 from C net -69.43000000000012
        1914 SELL 219 from B net 1517.6700000000008
        1922 SELL 13 from B net 90.09000000000005
        1923 SELL 188 from A net -344.04000000000235
        1943 SELL 162 from B net 1198.8000000000004
        1998 Sell 57 from B net -30.210000000000065
        1998 SELL 65 from B net -156.65000000000023
        2007 Sell 63 from C net 68.04000000000079
        2007 SELL 12 from C net -78.4799999999999
        2023 Sell 99 from B net -9.90000000000014
        2023 SELL 144 from B net 1108.8
        2029 Sell 236 from A net 2331.6800000000057
        2029 Sell 36 from A net 627.1200000000006
        2029 Sell 25 from A net 313.7500000000003
        2029 SELL 69 from A net 4048.9200000000005
        2042 Sell 31 from A net 1767.0
        2042 Sell 154 from A net 11252.78
        2042 SELL 285 from A net 13104.300000000005
        2044 Sell 132 from A net 5616.600000000001
        2044 SELL 199 from A net 7452.549999999997
        2064 SELL 11 from A net 573.5399999999998
        2086 Sell 83 from A net 4012.219999999998
        2086 Sell 80 from A net 4001.5999999999985
        2086 SELL 57 from A net 2390.58
        2102 Sell 267 from A net 13763.850000000002
        2102 SELL 154 from A net 7735.419999999998
        2133 Sell 175 from C net -813.750000000001
        2133 Sell 7 from C net -41.579999999999984
        2133 SELL 121 from C net -2321.99
        2145 Sell 232 from C net -4234.0
        2145 SELL 14 from C net -404.18000000000006
        2162 SELL 255 from C net -8996.4
        2181 SELL 0 from A net -0.0
        2222 Sell 185 from A net 1903.6500000000037
        2222 SELL 197 from A net 9067.91
        2228 SELL 195 from B net 0.0
        2282 SELL 333 from B net -606.0600000000001
        2311 SELL 73 from B net -229.22000000000003
        2331 SELL 116 from B net -62.6399999999999
        2336 SELL 6 from B net -1.8600000000000136
        2354 SELL 56 from C net 61.039999999999395
        2383 SELL 0 from A net -0.0
        2387 Sell 169 from A net -1216.800000000003
        2387 Sell 51 from A net 1614.1499999999987
        2387 Sell 120 from A net 4635.599999999999
        2387 SELL 5 from A net 198.64999999999995
        2401 SELL 120 from A net 4657.200000000001
        2433 SELL 75 from C net -85.50000000000004
        2443 Sell 48 from C net -192.48000000000025
        2443 Sell 273 from C net -1094.7300000000014
        2443 SELL 34 from C net -379.1000000000002
        2458 SELL 52 from B net -15.600000000000037
        2478 SELL 90 from C net -1354.500000000001
        2497 Sell 57 from B net -90.0600000000001
        2497 Sell 21 from B net -48.930000000000035
        2497 SELL 223 from B net -1219.8100000000006
        2524 Sell 172 from A net 4324.080000000003
        2524 SELL 251 from A net 2818.7300000000046
        2566 SELL 89 from B net 19.5799999999999
        2595 Sell 412 from C net 4882.2000000000035
        2595 SELL 72 from C net 363.5999999999998
        2619 Sell 86 from C net 9.459999999999951
        2619 SELL 126 from C net -128.5199999999995
        2633 Sell 179 from A net -1532.2400000000005
        2633 SELL 242 from A net -3913.140000000004
        2665 SELL 25 from B net -1.2500000000000178
        2675 SELL 98 from C net -319.4800000000005
        2695 Sell 281 from A net -587.290000000001
        2695 Sell 62 from A net -2179.9200000000014
        2695 SELL 126 from A net -3113.460000000001
        2735 Sell 110 from B net 93.49999999999977
        2735 SELL 43 from B net -71.38000000000001
        2746 SELL 81 from C net 59.13000000000032
        2761 Sell 8 from A net -338.64
        2761 Sell 179 from A net -9030.550000000001
        2761 SELL 150 from A net -4222.499999999999
        2766 SELL 167 from B net -91.84999999999953
        2789 SELL 73 from B net -229.21999999999977
        2803 Sell 59 from C net -301.48999999999995
        2803 SELL 255 from C net -1448.399999999998
        2816 Sell 79 from B net -36.34000000000007
        2816 Sell 225 from B net -643.4999999999999
        2816 SELL 117 from B net -643.5
        2838 Sell 19 from B net -101.26999999999997
        2838 Sell 313 from B net -1655.7699999999998
        2838 SELL 144 from B net -810.7199999999998
        2891 Sell 241 from B net -322.93999999999994
        2891 Sell 7 from B net -5.59999999999998
        2891 SELL 2 from B net -11.339999999999996
        2904 SELL 393 from A net -1013.9399999999994
        Shares remaiming 28632
        Total captital gain: 38830.52000000001



