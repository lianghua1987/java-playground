//package com.hua.test;
//
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.*;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static com.hua.test.ServiceA.MSG;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.mockStatic;
//
//@ExtendWith(MockitoExtension.class)
//public class TestMockito {
//
//    @InjectMocks
//    ServiceA serviceA;
//
//    @Spy
//    ServiceB serviceB;
//
//    @Mock
//    ServiceC serviceC;
//
//
//    @Captor
//    ArgumentCaptor<String> stringArgumentCaptor;
//
//    @Test
//    public void testMockito1() {
//        serviceA.callMethodB();
//        verify(serviceB, times(1)).method(stringArgumentCaptor.capture());
//        assertEquals(MSG, stringArgumentCaptor.getValue());
//    }
//
//    @Test
//    public void testMockito2() {
//        serviceA.callMethodB();
//        verify(serviceB, times(1)).method(stringArgumentCaptor.capture());
//        assertEquals(MSG, stringArgumentCaptor.getValue());
//    }
//
//    @Test
//    public void testMockito3() {
//        // BDD - given, when, then
//        given(serviceA.callMethodB()).willReturn("fake return");
//        String str = serviceA.callMethodB();
//        assertEquals("fake return", str);
//    }
//
//    @Test
//    public void testMockito4() {
////        lenient().when(serviceC.method()).thenReturn("this is unused");
//        serviceA.callMethodB();
//        verify(serviceB, times(1)).method(stringArgumentCaptor.capture());
//        assertEquals(MSG, stringArgumentCaptor.getValue());
//    }
//
//    @Test
//    public void testMockito5() {
////        lenient().when(serviceC.method()).thenReturn("this is unused");
//        String str = serviceA.callMethodC();
//        System.out.println(str);
//    }
//
//
//    @Test
//    public void testMockito6() {
//        try (MockedStatic<ServiceD> mockedStatic = mockStatic(ServiceD.class)) {
//            mockedStatic.when(() -> ServiceD.method(anyString())).thenReturn("make some sense");
//            String str = serviceA.callMethodD("");
//            assertEquals("make some sense", str);
//        }
//    }
//
//    @Test
//    public void testMockito7() {
//        try (MockedStatic<ServiceD> mockedStatic = mockStatic(ServiceD.class)) {
//            mockedStatic.when(() -> ServiceD.method(anyString()))
//                    .thenAnswer(invocationOnMock -> invocationOnMock.getArgument(0) + " - add here");
//
//            String str = serviceA.callMethodD("make some sense");
//            assertEquals("make some sense - add here", str);
//        }
//    }
//}
