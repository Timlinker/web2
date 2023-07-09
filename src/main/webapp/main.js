$(document).ready(function() {
    $('#uploadForm').submit(function(event) {
        event.preventDefault(); // Предотвращаем отправку формы по умолчанию

        var formData = new FormData(this);
        var ed807 = $('#myTable');
        $.ajax({
            url: '/upload',
            type: 'POST',
            data: formData,
            processData: false,
            contentType: false,
            success: function(response) {
                console.log(response);
                console.log(response.success);
                console.log(response.message);
                console.log(response.status);
                console.log(response.cause);
                console.log(response.stacktrace);
                if (response.success) {
                    alert("Файл загружен и обраторан успешно!");
                    console.log(response.data);

                    // Очищаем таблицы перед заполнением новыми данными
                    $('#myTable').DataTable().clear().draw();
                    $('#bicDirectoryTable').DataTable().clear().draw();

                    // Заполняем таблицу ED807 данными
                    var ed807Data = response.data;
                    var ed807Row = [
                        ed807Data.CreationDateTime,
                        ed807Data.EDDate,
                        ed807Data.EDAuthor,
                        ed807Data.EDReceiver,
                        ed807Data.CreationReason,
                        ed807Data.CreationDateTime,
                        ed807Data.InfoTypeCode,
                        ed807Data.BusinessDay,
                        ed807Data.DirectoryVersion
                    ];
                    ed807.DataTable().row.add(ed807Row).draw();

                    // Заполняем таблицу bicDirectoryEntry данными
                    var bicDirectoryEntries = response.data.bicDirectoryEntry;
                    var participantInfo = null;
                    bicDirectoryEntries.forEach(function(entry) {
                        participantInfo = entry.participantInfo;
                        var bicDirectoryRow = [
                            entry.BIC,
                            participantInfo.NameP,
                            participantInfo.RegN,
                            participantInfo.CntrCd,
                            participantInfo.Rgn,
                            participantInfo.Ind,
                            participantInfo.Tnp,
                            participantInfo.Nnp,
                            participantInfo.Adr,
                            participantInfo.PrntBIC,
                            participantInfo.DateIn,
                            participantInfo.DateOut,
                            participantInfo.PtType,
                            participantInfo.Srvcs,
                            participantInfo.XchType,
                            participantInfo.UID,
                            participantInfo.ParticipantStatus
                        ];
                        $('#bicDirectoryTable').DataTable().row.add(bicDirectoryRow).draw();
                    });

                } else {
                    console.error(response.message);
                    alert(response.message);
                }
            },
            error: function(xhr, status, error) {
                console.error('Error:', error);
            }
        });
    });
});