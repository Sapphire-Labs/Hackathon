import { CHANGE_WEBSITE_LANGUAGE, CHANGE_DARK_MODE } from "./types";
import { SITE_LOCALE_KEY, PREFERS_DARK_MODE_KEY } from "../../static/keys/local-storage-keys";

export const changeWebsiteLanguage = (locale: string) => (dispatch: any) => {
  localStorage.setItem(SITE_LOCALE_KEY, locale);
  dispatch({
    type: CHANGE_WEBSITE_LANGUAGE,
    payload: { locale },
  });
};

export const changeDarkMode = (prefersDarkMode: boolean) => (dispatch: any) => {
  localStorage.setItem(PREFERS_DARK_MODE_KEY, prefersDarkMode.toString());
  dispatch({
    type: CHANGE_DARK_MODE,
    payload: { prefersDarkMode },
  });
};