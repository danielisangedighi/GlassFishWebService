/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package addition;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "Addition")
public class Addition {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "addition")
    public Integer addition(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return a+b;
    }
}
