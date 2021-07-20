package org.wikipedia.search;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.wikipedia.R;
import org.wikipedia.TestUtil;
import org.wikipedia.main.MainActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchTest {

    private String searchText = "OneFootball";
    @Rule
    public ActivityScenarioRule<MainActivity> mActivity = new ActivityScenarioRule<>(MainActivity.class);


    @Before
    public void skip(){
        onView(withId(R.id.fragment_onboarding_skip_button)).perform(click());
    }

    // Search something
    @Test
    public void a_searchSomething()
    {
        onView(allOf(withId(R.id.search_container), isDisplayed())).perform(click());
        onView(allOf(withId(R.id.search_src_text), isDisplayed())).perform(typeText(searchText), ViewActions.closeSoftKeyboard());
    }

    //View the search result
    @Test
    public void b_viewSearchResult()
    {
        onView(allOf(withId(R.id.search_container), isDisplayed())).perform(click());
        onView(allOf(withId(R.id.search_src_text), isDisplayed())).perform(typeText(searchText), ViewActions.closeSoftKeyboard());
    }

    // clear browsing history
    @Test
    public void c_clearHistory()
    {

    }

    //clear recent searches
    public void d_recentSearch()
    {
        
    }




}
