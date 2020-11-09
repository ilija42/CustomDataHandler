package service;

import model.Entity;

public class ObjectConverterCustom implements IObjectConverter {

    private static ObjectConverterCustom instance;


    public synchronized static IObjectConverter getInstance() {
        if (instance == null)
            instance = new ObjectConverterCustom();
        return instance;
    }

    @Override
    public String objectToFormat(Object object) throws Exception {
        CustomMapper objectMapper = CustomMapper.getInstance();

        return objectMapper.writeValueAsString((Entity)object);
    }

    @Override
    public Object formatToObject(String format, Class<?> classOf) throws Exception {
        CustomMapper objectMapper = CustomMapper.getInstance();

        return objectMapper.readValueAsList(format).get(0);
    }
}
