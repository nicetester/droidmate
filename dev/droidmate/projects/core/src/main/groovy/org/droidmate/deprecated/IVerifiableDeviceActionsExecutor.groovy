// Copyright (c) 2012-2015 Saarland University
// All rights reserved.
//
// Author: Konrad Jamrozik, jamrozik@st.cs.uni-saarland.de
//
// This file is part of the "DroidMate" project.
//
// www.droidmate.org

package org.droidmate.deprecated

import org.droidmate.device.datatypes.IGuiState

@Deprecated
public interface IVerifiableDeviceActionsExecutor
{

  IGuiState executeAndVerify(VerifiableDeviceActions verifiableDeviceActions)
}