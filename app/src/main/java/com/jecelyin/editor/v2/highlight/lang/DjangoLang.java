/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class DjangoLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{% comment %}\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{% endcomment %}\",\"NAME\":\"commentEnd\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"html::MAIN\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DJANGO\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"JAVASCRIPT_OPENTAG\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<SCRIPT\"},{\"tag\":\"END\",\"text\":\"<\\/SCRIPT>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"CSS_OPENTAG\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<STYLE\"},{\"tag\":\"END\",\"text\":\"<\\/STYLE>\"}]},{\"tag\":\"SEQ_REGEXP\",\"text\":\"<\\/?\\\\w+\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"TAGS\",\"HASH_CHAR\":\"<\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DJANGO\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{% comment %}\"},{\"tag\":\"END\",\"text\":\"{% endcomment %}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD3\",\"DELEGATE\":\"DJANGO_BLOCK\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{%\"},{\"tag\":\"END\",\"text\":\"%}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD3\",\"DELEGATE\":\"DJANGO_VARIABLE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{{\"},{\"tag\":\"END\",\"text\":\"}}\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"JAVASCRIPT_OPENTAG\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"JAVASCRIPT\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"TAGS\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"html::TAGS\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"JAVASCRIPT\",\"DEFAULT\":\"MARKUP\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"TO_LITERAL+DJANGO\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DJANGO\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"javascript::MAIN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"CSS_OPENTAG\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"CSS\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"TO_LITERAL+DJANGO\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"CSS\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"TO_LITERAL+DJANGO\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DJANGO\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"css::MAIN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TAGS\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"TO_LITERAL+DJANGO\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"html::TAGS\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"MAIN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TO_LITERAL+DJANGO\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"LITERAL1+DJANGO\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"LITERAL1+DJANGO\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DJANGO\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LITERAL1+DJANGO\",\"DEFAULT\":\"LITERAL1\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DJANGO\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DJANGO_VARIABLE\",\"DEFAULT\":\"LITERAL4\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DJANGO_CORE\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DJANGO_BLOCK\",\"DEFAULT\":\"LITERAL4\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DJANGO_CORE\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"OPERATOR\",\"text\":\"==\"},{\"tag\":\"OPERATOR\",\"text\":\"!=\"},{\"tag\":\"OPERATOR\",\"text\":\"<\"},{\"tag\":\"OPERATOR\",\"text\":\">\"},{\"tag\":\"OPERATOR\",\"text\":\"<=\"},{\"tag\":\"OPERATOR\",\"text\":\">=\"},{\"tag\":\"KEYWORD1\",\"text\":\"in\"},{\"tag\":\"KEYWORD1\",\"text\":\"not\"},{\"tag\":\"KEYWORD1\",\"text\":\"and\"},{\"tag\":\"KEYWORD1\",\"text\":\"or\"},{\"tag\":\"KEYWORD1\",\"text\":\"as\"},{\"tag\":\"KEYWORD1\",\"text\":\"cache\"},{\"tag\":\"KEYWORD1\",\"text\":\"endcache\"},{\"tag\":\"KEYWORD1\",\"text\":\"autoescape\"},{\"tag\":\"KEYWORD1\",\"text\":\"block\"},{\"tag\":\"KEYWORD1\",\"text\":\"endblock\"},{\"tag\":\"KEYWORD1\",\"text\":\"csrf_token\"},{\"tag\":\"KEYWORD1\",\"text\":\"cycle\"},{\"tag\":\"KEYWORD1\",\"text\":\"debug\"},{\"tag\":\"KEYWORD1\",\"text\":\"extends\"},{\"tag\":\"KEYWORD1\",\"text\":\"filter\"},{\"tag\":\"KEYWORD1\",\"text\":\"endfilter\"},{\"tag\":\"KEYWORD1\",\"text\":\"firstof\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"endif\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"endfor\"},{\"tag\":\"KEYWORD1\",\"text\":\"empty\"},{\"tag\":\"KEYWORD1\",\"text\":\"endifchanged\"},{\"tag\":\"KEYWORD1\",\"text\":\"endifequal\"},{\"tag\":\"KEYWORD1\",\"text\":\"ifnotequal\"},{\"tag\":\"KEYWORD1\",\"text\":\"endifnotequal\"},{\"tag\":\"KEYWORD1\",\"text\":\"include\"},{\"tag\":\"KEYWORD1\",\"text\":\"load\"},{\"tag\":\"KEYWORD1\",\"text\":\"now\"},{\"tag\":\"KEYWORD1\",\"text\":\"regroup\"},{\"tag\":\"KEYWORD1\",\"text\":\"spaceless\"},{\"tag\":\"KEYWORD1\",\"text\":\"endspaceless\"},{\"tag\":\"KEYWORD1\",\"text\":\"ssi\"},{\"tag\":\"KEYWORD1\",\"text\":\"templatetag\"},{\"tag\":\"KEYWORD1\",\"text\":\"url\"},{\"tag\":\"KEYWORD1\",\"text\":\"widthratio\"},{\"tag\":\"KEYWORD1\",\"text\":\"with\"},{\"tag\":\"KEYWORD1\",\"text\":\"endwith\"},{\"tag\":\"KEYWORD1\",\"text\":\"trans\"},{\"tag\":\"KEYWORD1\",\"text\":\"blocktrans\"},{\"tag\":\"KEYWORD1\",\"text\":\"endblocktrans\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DJANGO_CORE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\":\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\",\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"LITERAL3\",\"text\":\"Argument\"},{\"tag\":\"LITERAL3\",\"text\":\"openblock\"},{\"tag\":\"LITERAL3\",\"text\":\"closeblock\"},{\"tag\":\"LITERAL3\",\"text\":\"openvariable\"},{\"tag\":\"LITERAL3\",\"text\":\"closevariable\"},{\"tag\":\"LITERAL3\",\"text\":\"openbrace\"},{\"tag\":\"LITERAL3\",\"text\":\"closebrace\"},{\"tag\":\"LITERAL3\",\"text\":\"opencomment\"},{\"tag\":\"LITERAL3\",\"text\":\"closecomment\"},{\"tag\":\"FUNCTION\",\"text\":\"add\"},{\"tag\":\"FUNCTION\",\"text\":\"addslashes\"},{\"tag\":\"FUNCTION\",\"text\":\"capfirst\"},{\"tag\":\"FUNCTION\",\"text\":\"center\"},{\"tag\":\"FUNCTION\",\"text\":\"cut\"},{\"tag\":\"FUNCTION\",\"text\":\"date\"},{\"tag\":\"FUNCTION\",\"text\":\"default\"},{\"tag\":\"FUNCTION\",\"text\":\"default_if_none\"},{\"tag\":\"FUNCTION\",\"text\":\"dictsort\"},{\"tag\":\"FUNCTION\",\"text\":\"dictsortreversed\"},{\"tag\":\"FUNCTION\",\"text\":\"divisibleby\"},{\"tag\":\"FUNCTION\",\"text\":\"escape\"},{\"tag\":\"FUNCTION\",\"text\":\"escapejs\"},{\"tag\":\"FUNCTION\",\"text\":\"filesizeformat\"},{\"tag\":\"FUNCTION\",\"text\":\"first\"},{\"tag\":\"FUNCTION\",\"text\":\"fix_ampersands\"},{\"tag\":\"FUNCTION\",\"text\":\"floatformat\"},{\"tag\":\"FUNCTION\",\"text\":\"force_escape\"},{\"tag\":\"FUNCTION\",\"text\":\"get_digit\"},{\"tag\":\"FUNCTION\",\"text\":\"iriencode\"},{\"tag\":\"FUNCTION\",\"text\":\"join\"},{\"tag\":\"FUNCTION\",\"text\":\"last\"},{\"tag\":\"FUNCTION\",\"text\":\"length\"},{\"tag\":\"FUNCTION\",\"text\":\"length_is\"},{\"tag\":\"FUNCTION\",\"text\":\"linebreaks\"},{\"tag\":\"FUNCTION\",\"text\":\"linebreaksbr\"},{\"tag\":\"FUNCTION\",\"text\":\"linenumbers\"},{\"tag\":\"FUNCTION\",\"text\":\"ljust\"},{\"tag\":\"FUNCTION\",\"text\":\"lower\"},{\"tag\":\"FUNCTION\",\"text\":\"make_list\"},{\"tag\":\"FUNCTION\",\"text\":\"phone2numeric\"},{\"tag\":\"FUNCTION\",\"text\":\"pluralize\"},{\"tag\":\"FUNCTION\",\"text\":\"pprint\"},{\"tag\":\"FUNCTION\",\"text\":\"random\"},{\"tag\":\"FUNCTION\",\"text\":\"removetags\"},{\"tag\":\"FUNCTION\",\"text\":\"rjust\"},{\"tag\":\"FUNCTION\",\"text\":\"safe\"},{\"tag\":\"FUNCTION\",\"text\":\"safeseq\"},{\"tag\":\"FUNCTION\",\"text\":\"slice\"},{\"tag\":\"FUNCTION\",\"text\":\"slugify\"},{\"tag\":\"FUNCTION\",\"text\":\"stringformat\"},{\"tag\":\"FUNCTION\",\"text\":\"striptags\"},{\"tag\":\"FUNCTION\",\"text\":\"time\"},{\"tag\":\"FUNCTION\",\"text\":\"timesince\"},{\"tag\":\"FUNCTION\",\"text\":\"timeuntil\"},{\"tag\":\"FUNCTION\",\"text\":\"title\"},{\"tag\":\"FUNCTION\",\"text\":\"truncatewords\"},{\"tag\":\"FUNCTION\",\"text\":\"truncatewords_html\"},{\"tag\":\"FUNCTION\",\"text\":\"unordered_list\"},{\"tag\":\"FUNCTION\",\"text\":\"upper\"},{\"tag\":\"FUNCTION\",\"text\":\"urlencode\"},{\"tag\":\"FUNCTION\",\"text\":\"urlize\"},{\"tag\":\"FUNCTION\",\"text\":\"urlizetrunc\"},{\"tag\":\"FUNCTION\",\"text\":\"wordcount\"},{\"tag\":\"FUNCTION\",\"text\":\"wordwrap\"},{\"tag\":\"FUNCTION\",\"text\":\"yesno\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}