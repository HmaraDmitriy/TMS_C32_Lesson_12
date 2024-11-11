package com.teachmeskills.lesson_12.task_1.fabric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson_12.task_1.constants.Constant.HEX_COD_REGISTR;

public class Verification {
     public static String HecCodVerification( String hex) {
         Pattern pattern = Pattern.compile(HEX_COD_REGISTR);
         Matcher matcher = pattern.matcher(hex);
         return (matcher.find()?"Yes":"No");
    }
}