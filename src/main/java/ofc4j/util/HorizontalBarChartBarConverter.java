/*
This file is part of OFC4J.

OFC4J is free software: you can redistribute it and/or modify
it under the terms of the Lesser GNU General Public License as
published by the Free Software Foundation, either version 3 of
the License, or (at your option) any later version.

OFC4J is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

See <http://www.gnu.org/licenses/lgpl-3.0.txt>.
*/

package ofc4j.util;

import ofc4j.model.elements.HorizontalBarChart;
import ofc4j.model.elements.HorizontalBarChart.Bar;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.path.PathTrackingWriter;

public class HorizontalBarChartBarConverter extends ConverterBase<Bar> {
    // @Override
    @SuppressWarnings("unchecked")
    public boolean canConvert(Class c) {
        return HorizontalBarChart.Bar.class.isAssignableFrom(c);
    }
    
    @Override
    public void convert(Bar o, PathTrackingWriter writer, MarshallingContext mc) {
        writeNode(writer, "right", o.getRight());
        writeNode(writer, "left", o.getLeft());
        writeNode(writer, "on-click", o.getOnClick());
    }
}
