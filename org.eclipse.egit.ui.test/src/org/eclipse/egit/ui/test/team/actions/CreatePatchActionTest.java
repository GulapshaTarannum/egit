 * Copyright (C) 2012, 2013 IBM Corporation and others.
import org.eclipse.egit.core.internal.CoreText;
import org.junit.Before;
	@Before
	public void setup() throws Exception {
		createProjectAndCommitToRepository();
		CommitOperation cop = new CommitOperation(commitables,
				Arrays.asList(commitables), TestUtil.TESTAUTHOR,
				TestUtil.TESTCOMMITTER, "Initial commit");
		LocationPage locationPage = createPatchWizard.getLocationPage();
		locationPage.selectClipboard();
		createPatchWizard.finishWithNoneFormat();
		createPatchWizard.finishWithNoneFormat();
		createPatchWizard.finishWithNoneFormat();