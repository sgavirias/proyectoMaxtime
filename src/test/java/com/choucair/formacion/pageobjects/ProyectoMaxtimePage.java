package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


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
    WebElementFacade btnProyecto;

    @FindBy(xpath = "//*[contains(@id, 'Dialog_v9_LE_v10_DXSelBtn1_D')]")
    WebElementFacade checkCodigoCliente;

    @FindBy(xpath = "//div[@id='Dialog_actionContainerHolder_Menu_DXI0_T']")
    WebElementFacade btnAceptar;

    @FindBy(xpath = "//input[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I']")
    WebElementFacade lblSearch;

    @FindBy(xpath =  "//*[contains(@id,'PopupWindowCallbackPanel_PopupWindow64692086_CIF-1')]")
    WebElementFacade iFrame;

    public void login() {

        lblUser.click();
        lblUser.sendKeys("sgavirias");
        lblPass.click();
        lblPass.sendKeys("santgasa1509");
        btnConectarse.click();



    }

    public void informacion() {
        Actions act = new Actions(getDriver());
        waitFor(2).seconds();
        act.moveToElement(btnFecha).click().perform();
        act.moveToElement(btnNuevo).click().perform();
        act.moveToElement(btnProyecto).click().perform();
        //waitFor(2).seconds();
        //getDriver().switchTo().frame(iFrame);
        getDriver().switchTo().frame("PopupWindowCallbackPanel_PopupWindow64692086_CIF-1");
        $("//div[@id='Dialog_actionContainerHolder_Menu_DXI1_T']").click();

        /*act.moveToElement(lblSearch).click().perform();
        lblSearch.sendKeys("CHM2");*/


        /*act.moveToElement(checkCodigoCliente).click().perform();
        act.moveToElement(btnAceptar).click().perform();*/

    }
}
