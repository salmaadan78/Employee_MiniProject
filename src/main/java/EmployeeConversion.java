import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class EmployeeConversion {

    public String employeeObjectToJSON(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
    public String employeeObjectToXML(Object object) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(object);
    }

    public Employee xmlToEmployeeObject (String value) throws JsonProcessingException {

        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(value, Employee.class);
    }

    public Employee jsonToEmployeeObject (String value) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(value, Employee.class);
    }

}
