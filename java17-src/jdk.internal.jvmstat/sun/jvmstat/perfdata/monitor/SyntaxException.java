/*
 * Copyright (c) 2004, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package sun.jvmstat.perfdata.monitor;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * Class for encapsulating syntax exceptions generated by AliasFileParser.
 *
 * @author Brian Doherty
 * @since 1.5
 */
@SuppressWarnings("serial") // JDK implementation class
public class SyntaxException extends Exception {
    int lineno;

    public SyntaxException(int lineno) {
        this.lineno = lineno;
    }

    public String getMessage() {
        return "syntax error at line " + lineno;
    }
}
