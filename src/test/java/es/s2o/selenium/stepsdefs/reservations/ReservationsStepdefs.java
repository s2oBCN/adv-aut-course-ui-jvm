package es.s2o.selenium.stepsdefs.reservations;

import es.s2o.selenium.pages.ReservationListPage;
import es.s2o.selenium.pages.ReservationPage;
import es.s2o.selenium.services.ReservationService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * Created by sacrists on 26.02.17.
 */
public class ReservationsStepdefs {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private static final String WEB_ROOT = "WEB_ROOT";
    private static final String HOME = "reservationList.html";

    @Steps
    private ReservationService reservationService;

    private ReservationListPage reservationListPage;
    private ReservationPage reservationPage;

    @Before
    public void beforeScenario() {
        LOGGER.debug("beforeScenario starts");
        // TODO Init data
    }

    @After
    public void afterScenario() {
        LOGGER.debug("afterScenario starts");
        // TODO Clean data
    }

    @Given("^I'm in the reservations page$")
    public void iMInTheReservationsPage() {
        LOGGER.debug("iMInTheReservationsPage starts");
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String baseUrl = variables.getProperty("WEB_ROOT");
        reservationPage.openAt(baseUrl + HOME);
    }

    @When("^I register the following reservations:$")
    public void iRegisterTheFollowingReservations(DataTable reservationDTOList) {
        // TODO add reservations
        LOGGER.info("iRegisterTheFollowingReservations");
        // LOGGER.debug("iRegisterTheFollowingReservations starts, list size:[{}]", reservationDTOList.size());
    }

    @Then("^I get the reservation in the reservations list$")
    public void iGetTheReservationInTheReservationsList() {
        LOGGER.debug("iGetTheReservationInTheReservationsList starts");
       // TODO Assert reservations
    }

}
