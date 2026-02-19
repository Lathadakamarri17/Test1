import{test, expect} from '@playwright/test';


test('getbyRole locator demo', async({page}) => {
    await page.goto('https://parabank.parasoft.com/parabank/index.htm')

await page.getByRole("link",{name:"Forgot login info?"}).click()
})
test('getByText locator demo', async ({page}) => {
     await page.goto('https://parabank.parasoft.com/parabank/index.htm')
     await page.getByText('Forgot login info?').click()

})

test('getByText loacator demo', async ({ page }) => {
    await page.goto('https://login.salesforce.com/') 
    await page.getByLabel('username').fill('Latha')

})
test('getByplaceholder demo', async ({ page }) => {
    await page.goto('https://www.amazon.in') 
    await page.getByPlaceholder('search').fill('casio watch for men')
    })

    test('getByAltText locator demo', async ({ page }) => {
    await page.goto('https://www.bookswagon.com') 
    await page.getByplaceholder('search by title, Author, publisher or ISBN').fill('fiction')
    await page.locator("xpath=//*[@name='btnTopSearch']").click();
    await page.getByAltText('Sacred Waters').click()
})

test('getbyTitlelocator demo', async({page}) => {
    await page.goto('https://parabank.parasoft.com/')
    await page.getByRole("link",alt="parabank)").click();
})

