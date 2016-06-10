/**
 * Created by RIchardHE on 6/6/16.
 */

import java.util.HashMap;

public class LightCommand {
    String input;
    Integer mode;
    HashMap<Integer, HashMap<Integer, Integer>> map;
    Integer startx;
    Integer starty;
    Integer endx;
    Integer endy;

    public LightCommand(String input, HashMap<Integer, HashMap<Integer, Integer>> map) {
        this.input = input;
        this.map = map;

        if ((new String(this.input.toCharArray(), 0, 7)).contentEquals("turn on")) {
            this.mode = 0;
            this.input = new String(this.input.toCharArray(), 8, this.input.length() - 8);
        } else if ((new String(this.input.toCharArray(), 0, 8)).contentEquals("turn off")) {
            this.mode = 1;
            this.input = new String(this.input.toCharArray(), 9, this.input.length() - 9);
        } else if ((new String(this.input.toCharArray(), 0, 6)).contentEquals("toggle")) {
            this.mode = 2;
            this.input = new String(this.input.toCharArray(), 7, this.input.length() - 7);
        }

        String buffer = "";
        for (Integer num = 0; num < this.input.toCharArray().length - 1; num++) {
            if (this.input.toCharArray()[num] == ',') {
                this.startx = Integer.parseInt(new String(this.input.toCharArray(), 0, num));
                this.input = new String(this.input.toCharArray(), num + 1, this.input.length() - num - 1);
                break;
            }

        }
        for (Integer num = 0; num < this.input.toCharArray().length - 1; num++) {
            if (this.input.toCharArray()[num] == ' ') {
                this.starty = Integer.parseInt(new String(this.input.toCharArray(), 0, num));
                this.input = new String(this.input.toCharArray(), num + 9, this.input.length() - num - 9);
                break;
            }

        }

        for (Integer num = 0; num < this.input.toCharArray().length - 1; num++) {
            if (this.input.toCharArray()[num] == ',') {
                this.endx = Integer.parseInt(new String(this.input.toCharArray(), 0, num));
                this.input = new String(this.input.toCharArray(), num + 1, this.input.length() - num - 1);
                break;
            }
        }

        this.endy = Integer.parseInt(this.input);
    }

    public static void main(String[] args) {
        String rinput = "turn on 887,9 through 959,629\n" +
                "turn on 454,398 through 844,448\n" +
                "turn off 539,243 through 559,965\n" +
                "turn off 370,819 through 676,868\n" +
                "turn off 145,40 through 370,997\n" +
                "turn off 301,3 through 808,453\n" +
                "turn on 351,678 through 951,908\n" +
                "toggle 720,196 through 897,994\n" +
                "toggle 831,394 through 904,860\n" +
                "toggle 753,664 through 970,926\n" +
                "turn off 150,300 through 213,740\n" +
                "turn on 141,242 through 932,871\n" +
                "toggle 294,259 through 474,326\n" +
                "toggle 678,333 through 752,957\n" +
                "toggle 393,804 through 510,976\n" +
                "turn off 6,964 through 411,976\n" +
                "turn off 33,572 through 978,590\n" +
                "turn on 579,693 through 650,978\n" +
                "turn on 150,20 through 652,719\n" +
                "turn off 782,143 through 808,802\n" +
                "turn off 240,377 through 761,468\n" +
                "turn off 899,828 through 958,967\n" +
                "turn on 613,565 through 952,659\n" +
                "turn on 295,36 through 964,978\n" +
                "toggle 846,296 through 969,528\n" +
                "turn off 211,254 through 529,491\n" +
                "turn off 231,594 through 406,794\n" +
                "turn off 169,791 through 758,942\n" +
                "turn on 955,440 through 980,477\n" +
                "toggle 944,498 through 995,928\n" +
                "turn on 519,391 through 605,718\n" +
                "toggle 521,303 through 617,366\n" +
                "turn off 524,349 through 694,791\n" +
                "toggle 391,87 through 499,792\n" +
                "toggle 562,527 through 668,935\n" +
                "turn off 68,358 through 857,453\n" +
                "toggle 815,811 through 889,828\n" +
                "turn off 666,61 through 768,87\n" +
                "turn on 27,501 through 921,952\n" +
                "turn on 953,102 through 983,471\n" +
                "turn on 277,552 through 451,723\n" +
                "turn off 64,253 through 655,960\n" +
                "turn on 47,485 through 734,977\n" +
                "turn off 59,119 through 699,734\n" +
                "toggle 407,898 through 493,955\n" +
                "toggle 912,966 through 949,991\n" +
                "turn on 479,990 through 895,990\n" +
                "toggle 390,589 through 869,766\n" +
                "toggle 593,903 through 926,943\n" +
                "toggle 358,439 through 870,528\n" +
                "turn off 649,410 through 652,875\n" +
                "turn on 629,834 through 712,895\n" +
                "toggle 254,555 through 770,901\n" +
                "toggle 641,832 through 947,850\n" +
                "turn on 268,448 through 743,777\n" +
                "turn off 512,123 through 625,874\n" +
                "turn off 498,262 through 930,811\n" +
                "turn off 835,158 through 886,242\n" +
                "toggle 546,310 through 607,773\n" +
                "turn on 501,505 through 896,909\n" +
                "turn off 666,796 through 817,924\n" +
                "toggle 987,789 through 993,809\n" +
                "toggle 745,8 through 860,693\n" +
                "toggle 181,983 through 731,988\n" +
                "turn on 826,174 through 924,883\n" +
                "turn on 239,228 through 843,993\n" +
                "turn on 205,613 through 891,667\n" +
                "toggle 867,873 through 984,896\n" +
                "turn on 628,251 through 677,681\n" +
                "toggle 276,956 through 631,964\n" +
                "turn on 78,358 through 974,713\n" +
                "turn on 521,360 through 773,597\n" +
                "turn off 963,52 through 979,502\n" +
                "turn on 117,151 through 934,622\n" +
                "toggle 237,91 through 528,164\n" +
                "turn on 944,269 through 975,453\n" +
                "toggle 979,460 through 988,964\n" +
                "turn off 440,254 through 681,507\n" +
                "toggle 347,100 through 896,785\n" +
                "turn off 329,592 through 369,985\n" +
                "turn on 931,960 through 979,985\n" +
                "toggle 703,3 through 776,36\n" +
                "toggle 798,120 through 908,550\n" +
                "turn off 186,605 through 914,709\n" +
                "turn off 921,725 through 979,956\n" +
                "toggle 167,34 through 735,249\n" +
                "turn on 726,781 through 987,936\n" +
                "toggle 720,336 through 847,756\n" +
                "turn on 171,630 through 656,769\n" +
                "turn off 417,276 through 751,500\n" +
                "toggle 559,485 through 584,534\n" +
                "turn on 568,629 through 690,873\n" +
                "toggle 248,712 through 277,988\n" +
                "toggle 345,594 through 812,723\n" +
                "turn off 800,108 through 834,618\n" +
                "turn off 967,439 through 986,869\n" +
                "turn on 842,209 through 955,529\n" +
                "turn on 132,653 through 357,696\n" +
                "turn on 817,38 through 973,662\n" +
                "turn off 569,816 through 721,861\n" +
                "turn on 568,429 through 945,724\n" +
                "turn on 77,458 through 844,685\n" +
                "turn off 138,78 through 498,851\n" +
                "turn on 136,21 through 252,986\n" +
                "turn off 2,460 through 863,472\n" +
                "turn on 172,81 through 839,332\n" +
                "turn on 123,216 through 703,384\n" +
                "turn off 879,644 through 944,887\n" +
                "toggle 227,491 through 504,793\n" +
                "toggle 580,418 through 741,479\n" +
                "toggle 65,276 through 414,299\n" +
                "toggle 482,486 through 838,931\n" +
                "turn off 557,768 through 950,927\n" +
                "turn off 615,617 through 955,864\n" +
                "turn on 859,886 through 923,919\n" +
                "turn on 391,330 through 499,971\n" +
                "toggle 521,835 through 613,847\n" +
                "turn on 822,787 through 989,847\n" +
                "turn on 192,142 through 357,846\n" +
                "turn off 564,945 through 985,945\n" +
                "turn off 479,361 through 703,799\n" +
                "toggle 56,481 through 489,978\n" +
                "turn off 632,991 through 774,998\n" +
                "toggle 723,526 through 945,792\n" +
                "turn on 344,149 through 441,640\n" +
                "toggle 568,927 through 624,952\n" +
                "turn on 621,784 through 970,788\n" +
                "toggle 665,783 through 795,981\n" +
                "toggle 386,610 through 817,730\n" +
                "toggle 440,399 through 734,417\n" +
                "toggle 939,201 through 978,803\n" +
                "turn off 395,883 through 554,929\n" +
                "turn on 340,309 through 637,561\n" +
                "turn off 875,147 through 946,481\n" +
                "turn off 945,837 through 957,922\n" +
                "turn off 429,982 through 691,991\n" +
                "toggle 227,137 through 439,822\n" +
                "toggle 4,848 through 7,932\n" +
                "turn off 545,146 through 756,943\n" +
                "turn on 763,863 through 937,994\n" +
                "turn on 232,94 through 404,502\n" +
                "turn off 742,254 through 930,512\n" +
                "turn on 91,931 through 101,942\n" +
                "toggle 585,106 through 651,425\n" +
                "turn on 506,700 through 567,960\n" +
                "turn off 548,44 through 718,352\n" +
                "turn off 194,827 through 673,859\n" +
                "turn off 6,645 through 509,764\n" +
                "turn off 13,230 through 821,361\n" +
                "turn on 734,629 through 919,631\n" +
                "toggle 788,552 through 957,972\n" +
                "toggle 244,747 through 849,773\n" +
                "turn off 162,553 through 276,887\n" +
                "turn off 569,577 through 587,604\n" +
                "turn off 799,482 through 854,956\n" +
                "turn on 744,535 through 909,802\n" +
                "toggle 330,641 through 396,986\n" +
                "turn off 927,458 through 966,564\n" +
                "toggle 984,486 through 986,913\n" +
                "toggle 519,682 through 632,708\n" +
                "turn on 984,977 through 989,986\n" +
                "toggle 766,423 through 934,495\n" +
                "turn on 17,509 through 947,718\n" +
                "turn on 413,783 through 631,903\n" +
                "turn on 482,370 through 493,688\n" +
                "turn on 433,859 through 628,938\n" +
                "turn off 769,549 through 945,810\n" +
                "turn on 178,853 through 539,941\n" +
                "turn off 203,251 through 692,433\n" +
                "turn off 525,638 through 955,794\n" +
                "turn on 169,70 through 764,939\n" +
                "toggle 59,352 through 896,404\n" +
                "toggle 143,245 through 707,320\n" +
                "turn off 103,35 through 160,949\n" +
                "toggle 496,24 through 669,507\n" +
                "turn off 581,847 through 847,903\n" +
                "turn on 689,153 through 733,562\n" +
                "turn on 821,487 through 839,699\n" +
                "turn on 837,627 through 978,723\n" +
                "toggle 96,748 through 973,753\n" +
                "toggle 99,818 through 609,995\n" +
                "turn on 731,193 through 756,509\n" +
                "turn off 622,55 through 813,365\n" +
                "turn on 456,490 through 576,548\n" +
                "turn on 48,421 through 163,674\n" +
                "turn off 853,861 through 924,964\n" +
                "turn off 59,963 through 556,987\n" +
                "turn on 458,710 through 688,847\n" +
                "toggle 12,484 through 878,562\n" +
                "turn off 241,964 through 799,983\n" +
                "turn off 434,299 through 845,772\n" +
                "toggle 896,725 through 956,847\n" +
                "turn on 740,289 through 784,345\n" +
                "turn off 395,840 through 822,845\n" +
                "turn on 955,224 through 996,953\n" +
                "turn off 710,186 through 957,722\n" +
                "turn off 485,949 through 869,985\n" +
                "turn on 848,209 through 975,376\n" +
                "toggle 221,241 through 906,384\n" +
                "turn on 588,49 through 927,496\n" +
                "turn on 273,332 through 735,725\n" +
                "turn on 505,962 through 895,962\n" +
                "toggle 820,112 through 923,143\n" +
                "turn on 919,792 through 978,982\n" +
                "toggle 489,461 through 910,737\n" +
                "turn off 202,642 through 638,940\n" +
                "turn off 708,953 through 970,960\n" +
                "toggle 437,291 through 546,381\n" +
                "turn on 409,358 through 837,479\n" +
                "turn off 756,279 through 870,943\n" +
                "turn off 154,657 through 375,703\n" +
                "turn off 524,622 through 995,779\n" +
                "toggle 514,221 through 651,850\n" +
                "toggle 808,464 through 886,646\n" +
                "toggle 483,537 through 739,840\n" +
                "toggle 654,769 through 831,825\n" +
                "turn off 326,37 through 631,69\n" +
                "turn off 590,570 through 926,656\n" +
                "turn off 881,913 through 911,998\n" +
                "turn on 996,102 through 998,616\n" +
                "turn off 677,503 through 828,563\n" +
                "turn on 860,251 through 877,441\n" +
                "turn off 964,100 through 982,377\n" +
                "toggle 888,403 through 961,597\n" +
                "turn off 632,240 through 938,968\n" +
                "toggle 731,176 through 932,413\n" +
                "turn on 5,498 through 203,835\n" +
                "turn on 819,352 through 929,855\n" +
                "toggle 393,813 through 832,816\n" +
                "toggle 725,689 through 967,888\n" +
                "turn on 968,950 through 969,983\n" +
                "turn off 152,628 through 582,896\n" +
                "turn off 165,844 through 459,935\n" +
                "turn off 882,741 through 974,786\n" +
                "turn off 283,179 through 731,899\n" +
                "toggle 197,366 through 682,445\n" +
                "turn on 106,309 through 120,813\n" +
                "toggle 950,387 through 967,782\n" +
                "turn off 274,603 through 383,759\n" +
                "turn off 155,665 through 284,787\n" +
                "toggle 551,871 through 860,962\n" +
                "turn off 30,826 through 598,892\n" +
                "toggle 76,552 through 977,888\n" +
                "turn on 938,180 through 994,997\n" +
                "toggle 62,381 through 993,656\n" +
                "toggle 625,861 through 921,941\n" +
                "turn on 685,311 through 872,521\n" +
                "turn on 124,934 through 530,962\n" +
                "turn on 606,379 through 961,867\n" +
                "turn off 792,735 through 946,783\n" +
                "turn on 417,480 through 860,598\n" +
                "toggle 178,91 through 481,887\n" +
                "turn off 23,935 through 833,962\n" +
                "toggle 317,14 through 793,425\n" +
                "turn on 986,89 through 999,613\n" +
                "turn off 359,201 through 560,554\n" +
                "turn off 729,494 through 942,626\n" +
                "turn on 204,143 through 876,610\n" +
                "toggle 474,97 through 636,542\n" +
                "turn off 902,924 through 976,973\n" +
                "turn off 389,442 through 824,638\n" +
                "turn off 622,863 through 798,863\n" +
                "turn on 840,622 through 978,920\n" +
                "toggle 567,374 through 925,439\n" +
                "turn off 643,319 through 935,662\n" +
                "toggle 185,42 through 294,810\n" +
                "turn on 47,124 through 598,880\n" +
                "toggle 828,303 through 979,770\n" +
                "turn off 174,272 through 280,311\n" +
                "turn off 540,50 through 880,212\n" +
                "turn on 141,994 through 221,998\n" +
                "turn on 476,695 through 483,901\n" +
                "turn on 960,216 through 972,502\n" +
                "toggle 752,335 through 957,733\n" +
                "turn off 419,713 through 537,998\n" +
                "toggle 772,846 through 994,888\n" +
                "turn on 881,159 through 902,312\n" +
                "turn off 537,651 through 641,816\n" +
                "toggle 561,947 through 638,965\n" +
                "turn on 368,458 through 437,612\n" +
                "turn on 290,149 through 705,919\n" +
                "turn on 711,918 through 974,945\n" +
                "toggle 916,242 through 926,786\n" +
                "toggle 522,272 through 773,314\n" +
                "turn on 432,897 through 440,954\n" +
                "turn off 132,169 through 775,380\n" +
                "toggle 52,205 through 693,747\n" +
                "toggle 926,309 through 976,669\n" +
                "turn off 838,342 through 938,444\n" +
                "turn on 144,431 through 260,951\n" +
                "toggle 780,318 through 975,495\n" +
                "turn off 185,412 through 796,541\n" +
                "turn on 879,548 through 892,860\n" +
                "turn on 294,132 through 460,338\n" +
                "turn on 823,500 through 899,529\n" +
                "turn off 225,603 through 483,920\n" +
                "toggle 717,493 through 930,875\n" +
                "toggle 534,948 through 599,968\n" +
                "turn on 522,730 through 968,950\n" +
                "turn off 102,229 through 674,529";

        //String rinput = "toggle 0,0 through 999,1";
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<Integer, HashMap<Integer, Integer>>();


        for (Integer n = 0; n < 1000; n++) {
            HashMap<Integer, Integer> inmap = new HashMap<Integer, Integer>();
            for (Integer m = 0; m < 1000; m++) {
                inmap.put(m, 0);
            }
            map.put(n, inmap);
        }

        String buffer = "";
        for (Character ch : rinput.toCharArray()) {
            if (ch != '\n') {
                buffer = buffer + ch.toString();
            } else {
                String input = buffer;
                LightCommand main = new LightCommand(input, map);
                map = main.compute();
                buffer = "";
            }
        }
        String input = buffer;
        LightCommand main = new LightCommand(input, map);
        map = main.compute();


        Integer lights = 0;

        for (Integer n = 0; n < 1000; n++) {
            for (Integer m = 0; m < 1000; m++) {
                lights += map.get(n).get(m);
            }
        }
        System.out.println(lights);

    }

    public HashMap<Integer, HashMap<Integer, Integer>> compute() {
        for (Integer n = 0; n < 1000; n++) {
            for (Integer m = 0; m < 1000; m++) {
                if (this.startx <= m && m <= this.endx && this.starty <= n && n <= this.endy) {
                    //System.out.println(m);
                    if (mode == 0) {
                        this.map.get(n).put(m, 1 + this.map.get(n).get(m));
                    } else if (mode == 1) {
                        if (this.map.get(n).get(m) >= 1) {
                            this.map.get(n).put(m, this.map.get(n).get(m) - 1);
                        }
                    } else if (mode == 2) {
                        this.map.get(n).put(m, 2 + this.map.get(n).get(m));
                        //System.out.println(this.map.get(n).get(m));
                    }

                }
            }
        }
        return this.map;
    }
}
