import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class EmployeeConversion {

    public String employeeObjectToJSON(Object Employee) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //it throws a checked exception
        return objectMapper.writeValueAsString(Employee);
    }

    public String objectToXml(Object Employee) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(Employee);
    }

    public Employee jsonToEmployeeObject(String value) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //it throws a checked exception
        return objectMapper.readValue(value, Employee.class);
    }

    public Employee xmlToEmployeeObject(String value) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(value, Employee.class);
    }

}
