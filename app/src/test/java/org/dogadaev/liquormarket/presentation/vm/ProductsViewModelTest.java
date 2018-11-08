package org.dogadaev.liquormarket.presentation.vm;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import junit.framework.TestCase;

import org.dogadaev.liquormarket.data.model.PageConfiguration;
import org.dogadaev.liquormarket.data.model.ProductItem;
import org.dogadaev.liquormarket.data.model.ProductsResponse;
import org.dogadaev.liquormarket.data.repository.LCBORepository;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import io.reactivex.Observable;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
public class ProductsViewModelTest {

    @BeforeClass
    public static void setupClass() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(
                __ -> Schedulers.trampoline());
    }

    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    private static final int TEST_CODE = 1182018;
    private static final String TEST_KEY = "MDo4YWUxZGEwNi1kZjRkLTExZTgtYjkxYi0xMzA1ZWYxNjg0ZGY6MGc4M0hhU2JBM1FBdW9CME1JSkZ5MUI5UjRPS2FLTHFCaTR3";
    private static final String TEST_PAGE = "1";

    @Mock
    LCBORepository lcboRepository;

    @Mock
    Application application;

    @Mock
    ConnectivityManager connectivityManager;

    @Mock
    ProductsResponse productsResponse;

    @Mock
    PageConfiguration pageConfiguration;

    @Mock
    List<ProductItem> productItems;

    @Mock
    NetworkInfo networkInfo;

    private ProductsViewModel productsViewModel;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        when(application.getSystemService(Context.CONNECTIVITY_SERVICE)).thenReturn(connectivityManager);
        when(connectivityManager.getActiveNetworkInfo()).thenReturn(networkInfo);
        when(networkInfo.isConnectedOrConnecting()).thenReturn(true);
        when(lcboRepository.getProducts(TEST_KEY, TEST_PAGE)).thenReturn(Observable.just(productsResponse));
        when(productsResponse.getPageConfiguration()).thenReturn(pageConfiguration);
        when(productsResponse.getItems()).thenReturn(productItems);

        productsViewModel = new ProductsViewModel(application, lcboRepository);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testResponseLiveData() throws Exception {
        productsViewModel.getPageConfigurationLiveData().observeForever(TestCase::assertNotNull);
        productsViewModel.getItemsLiveData().observeForever(TestCase::assertNotNull);
    }
}