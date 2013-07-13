/*
 * Copyright (C) 2013 Klaus Reimer <k@ailis.de>
 * See LICENSE.md for licensing information.
 */

package de.ailis.usb4java.libusb;

import static de.ailis.usb4java.test.UsbAssume.assumeUsbTestsEnabled;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link BOSDevCapabilityDescriptor} class.
 * 
 * @author Klaus Reimer (k@ailis.de)
 */
public class BOSDevCapabilityDescriptorTest
{
    /** The test subject. */
    private BOSDevCapabilityDescriptor descriptor;

    /**
     * Setup test.
     */
    @Before
    public void setUp()
    {
        assumeUsbTestsEnabled();
        LibUsb.init(null);
        this.descriptor = new BOSDevCapabilityDescriptor();
    }
    
    /**
     * Tear down test.
     */
    @After    
    public void tearDown()
    {
        LibUsb.exit(null);
    }

    /**
     * Tests uninitialized access to
     * {@link BOSDevCapabilityDescriptor#bLength()}
     */
    @Test(expected = IllegalStateException.class)
    public void testUninitializedLength()
    {
        assumeUsbTestsEnabled();
        this.descriptor.bLength();
    }

    /**
     * Tests uninitialized access to
     * {@link BOSDevCapabilityDescriptor#bDescriptorType()}
     */
    @Test(expected = IllegalStateException.class)
    public void testUninitializedDescriptorType()
    {
        assumeUsbTestsEnabled();
        this.descriptor.bDescriptorType();
    }

    /**
     * Tests uninitialized access to
     * {@link BOSDevCapabilityDescriptor#bDevCapabilityType()}
     */
    @Test(expected = IllegalStateException.class)
    public void testUninitializedDevCapabilityType()
    {
        assumeUsbTestsEnabled();
        this.descriptor.bDevCapabilityType();
    }

    /**
     * Tests uninitialized access to
     * {@link BOSDevCapabilityDescriptor#devCapabilityData()}
     */
    @Test(expected = IllegalStateException.class)
    public void testUninitializedDevCapabilityData()
    {
        assumeUsbTestsEnabled();
        this.descriptor.devCapabilityData();
    }
}
