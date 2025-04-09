import pandas as pd

df = pd.read_csv(
    "LogSiscram_Final_2025.csv",
    sep=";",
    encoding="utf-8"
)


print("Raw df head\n")

df["TimeEnd"] = pd.to_datetime(df["TimeEnd"], format="%d/%m/%Y %H:%M")

df["TimeStart"] = pd.to_datetime(df["TimeStart"], format="%d/%m/%Y %H:%M")

print(df.columns.values)

print(df.head())

last_activities = df.sort_values(["case_id", "TimeEnd"]).groupby("case_id")["activity"].last()

# Find case IDs where the last activity is NOT "AdminsitrativeSupport"
invalid_cases = last_activities[last_activities != "S19 : AdminsitrativeSupport"].index

print("Cases before cleaning the logfile",df["case_id"].nunique())

print("Invalid cases",invalid_cases.tolist())

# Remove cases that are in the invalid_cases list
df_cleaned = df[~df["case_id"].isin(invalid_cases)]

grouped_cleaned_df = df_cleaned.groupby("case_id")

print("Cases after cleaning the logfile",df_cleaned["case_id"].nunique())

# Save the cleaned DataFrame
df_cleaned.to_csv("cleaned_logfile.csv", sep=";", index=False, encoding="utf-8")

print("Cases removed. Cleaned log saved as 'cleaned_logfile.csv'.")


