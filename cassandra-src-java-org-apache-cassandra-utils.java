






/**
 * Logs the output of the specified process.
 *
 * @param p the process
 * @throws IOException if an I/O problem occurs
 */
private static void logProcessOutput(Process p) throws IOException
{
    try (BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream())))
    {
        StrBuilder builder = new StrBuilder();
        String line;
        while ((line = input.readLine()) != null)
        {
            builder.appendln(line);
        }
        logger.info(builder.toString());
    }
}