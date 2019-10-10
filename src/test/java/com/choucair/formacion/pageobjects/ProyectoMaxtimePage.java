package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("http://operacion.choucairtesting.com/MaxtimeChc/Login.aspx?ReturnUrl=%2fMaxtimeChc")

public class ProyectoMaxtimePage extends PageObject {

    @FindBy(xpath = "//input[@id='Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I']")
    WebElementFacade lblUser;


    @FindBy(xpath = "//input[@id='Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I']")
    WebElementFacade lblPass;

    @FindBy(xpath = "//div[@id='Logon_PopupActions_Menu_DXI0_T']")
    WebElementFacade btnConectarse;

    @FindBy(xpath = "//td[@id='Vertical_v1_LE_v2_tccell0_0']")
    WebElementFacade btnFecha;

    @FindBy(xpath = "//div[@id='Vertical_v3_MainLayoutView_xaf_l103_xaf_dviReporteDetallado_ToolBar_Menu_DXI0_T']")
    WebElementFacade btnNuevo;

    @FindBy(xpath = "//td[@id='Vertical_v8_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_B']")
                     //td[@id='Vertical_v11_MainLayoutEdit_xaf_l135_xaf_dviProyecto_Edit_Find_B']
    WebElementFacade btnProyecto;

    @FindBy(xpath = "//*[contains(@id, 'Dialog_v9_LE_v10_DXSelBtn1_D')]")
    WebElementFacade checkCodigoCliente;

    @FindBy(xpath = "//div[@id='Dialog_actionContainerHolder_Menu_DXI0_T']")
    WebElementFacade btnAceptar;

    //@FindBy(xpath = "//input[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I']")
    //WebElementFacade lblSearch;

    //@FindBy(xpath =  "//*[contains(@id,'PopupWindowCallbackPanel_PopupWindow64692086_CIF-1')]")
    //WebElementFacade iFrame;

    @FindBy(xpath = "//td[@id='Vertical_v8_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_B-1']//table[@class='dxbebt']")
    WebElementFacade btnTipoHora;

    @FindBy(xpath = "//td[@id='Vertical_v8_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_DDD_L_LBI3T0']")
    WebElementFacade listTipoHora;

    @FindBy(xpath = "//div[@id='Vertical_v8_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_CD']")
    WebElementFacade btnServicio;

    @FindBy(xpath = "//input[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I']")
    WebElementFacade lblTxtSearch;

    @FindBy(xpath = "//td[@id='Dialog_v11_LE_v12_tccell0_0']")
    WebElementFacade btnNombServicio;

    @FindBy(xpath = "//td[@id='Vertical_v8_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1']")
    WebElementFacade btnActividad;

    @FindBy(xpath = "//td[@id='Vertical_v8_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_DDD_L_LBI3T0']")
    WebElementFacade listActividad;

    @FindBy(xpath = "//table[@id='Vertical_v8_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit']//td[@class='dxic']")
    WebElementFacade lblHorasEjecutadas;

    @FindBy(xpath = "//table[@id='Vertical_v8_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit']//td[@class='dxic']")
    WebElementFacade lblComentario;

    public void login() {

        lblUser.click();
        lblUser.sendKeys("sgavirias");
        lblPass.click();
        lblPass.sendKeys("santgasa1509");
        btnConectarse.click();



    }

    public void informacion() {

        WebDriverWait iframe = new WebDriverWait(getDriver(), 5);

        Actions act = new Actions(getDriver());
        waitFor(2).seconds();
        act.moveToElement(btnFecha).click().perform();
        act.moveToElement(btnNuevo).click().perform();
        act.moveToElement(btnProyecto).click().perform();


        iframe.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[1]")));
        //getDriver().switchTo().frame("PopupWindowCallbackPanel_PopupWindow64692086_CIF-1");


        act.moveToElement(checkCodigoCliente).click().perform();
        act.moveToElement(btnAceptar).click().perform();

        act.moveToElement(btnTipoHora).click().perform();
        act.moveToElement(listTipoHora).click().perform();

        act.moveToElement(btnServicio).click().perform();
        iframe.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//iframe)[1]")));

        lblTxtSearch.typeAndEnter("clá");
        act.moveToElement(btnNombServicio).click().perform();
        waitFor(10).seconds();
        btnActividad.click();
        //act.moveToElement(btnActividad).click().perform();
        act.moveToElement(listActividad).click().perform();

        act.moveToElement(lblHorasEjecutadas).click().sendKeys("9").perform();

        act.moveToElement(lblComentario).click().sendKeys("Práctica automatización").perform();
    }
}
