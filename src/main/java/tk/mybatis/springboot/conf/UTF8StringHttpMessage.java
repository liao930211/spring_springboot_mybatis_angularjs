package tk.mybatis.springboot.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: liaohao
 * @Date: 2016/4/26 22:56
 */
@Configuration
public class UTF8StringHttpMessage extends AbstractHttpMessageConverter<StringHttpMessageConverter> {


    @Override
    protected boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    protected StringHttpMessageConverter readInternal(Class<? extends StringHttpMessageConverter> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(StringHttpMessageConverter stringHttpMessageConverter, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        stringHttpMessageConverter.setWriteAcceptCharset(true);
        List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
        supportedMediaTypes.add(new MediaType("text/plain;charset=UTF-8"));
        supportedMediaTypes.add(new MediaType("text/html;charset=UTF-8"));
        stringHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
    }
}
