package org.jory.wishbone.common.guawa.ch2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.jory.wishbone.common.guawa.ImageInfo;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;

public class DateFormatFunction implements Function<Date, String> {

    @Override
    public String apply(Date input) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	return dateFormat.format(input);
    }
    /**
    public Function<Date, String> getFunction() {
        return new Function<Date, String>() {
           @Override
           public String apply( Date input) {
                 return new SimpleDateFormat("dd/mm/yyyy").format(input);
           }
        ￼};
    }
*/
    
    @Test
    public void testTransform() throws Exception {
	FluentIterable<ImageInfo> personList = null;
	List<String> transformedPersonList = FluentIterable.from(personList)
		.transform(new Function<ImageInfo, String>() {
		    @Override
		    public String apply(ImageInfo input) {
			return Joiner.on('#').join(input.getImageId(), input.getOwnedId(), input.getPath());
		    }
		}).toList();
	//assertThat(transformedPersonList.get(1), is("Flintstone#Fred#32"));
    }
}
