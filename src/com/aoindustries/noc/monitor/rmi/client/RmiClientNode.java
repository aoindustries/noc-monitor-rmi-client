/*
 * Copyright 2012 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.noc.monitor.rmi.client;

import com.aoindustries.noc.monitor.common.Node;
import com.aoindustries.noc.monitor.wrapper.WrappedNode;

/**
 * @author  AO Industries, Inc.
 */
public class RmiClientNode extends WrappedNode {

    RmiClientNode(RmiClientMonitor monitor, Node wrapped) {
        super(monitor, wrapped);
    }
}
