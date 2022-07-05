package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        boolean isMinus = s.indexOf(" - ") != -1;
        boolean isMultiply = s.indexOf(" * ") != -1;
        boolean isDivision = s.indexOf(" / ") != -1;

        if (isMinus) { // -가 있으면 - 진행
            return runMinus(s);
        }
        if(isMultiply) {
            return runMultiply(s);
        }
        if(isDivision) {
            return runDivision(s);
        }

        if(s.length() > 5) {
            return runTriplePlus(s);
        }

        return runPlus(s);
    }


    private static int runTriplePlus(String s) {
        String[] sBits = s.split(" \\+ "); // + 로 문자열 split
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);
        int no3 = Integer.parseInt(sBits[2]);


        return no1 + no2 + no3;
    }

    private static int runPlus(String s) {
        String[] sBits = s.split(" \\+ "); // + 로 문자열 split
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split(" \\- "); // - 로 문자열 split
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

    private static int runMultiply(String s) {
        String[] sBits = s.split(" \\* "); // * 로 문자열 split
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

    private static int runDivision(String s) {
        String[] sBits = s.split(" \\/ "); // * 로 문자열 split
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 / no2;
    }
}